package Juego;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import control.Teclado;
import entes.criaturas.Jugador;
import graficos.Pantalla;
import graficos.Sprite;
import mapa.Mapa;
import mapa.MapaCargado;
import mapa.MapaGenerado;

public class juego extends Canvas implements Runnable {

	private static final long serialVersionUID = 1L;

	private static final int ANCHO = 400;
	private static final int ALTO = 300;
	private static final String TITULO = "Juego";
	private static String CONTADOR_FPS = "";
	private static String  CONTADOR_APS = "";
	
	private static BufferedImage imagen = new BufferedImage(ANCHO, ALTO,
			BufferedImage.TYPE_INT_RGB);
	private static int[] pixeles = ((DataBufferInt) imagen.getRaster()
			.getDataBuffer()).getData();
	
	private static final ImageIcon icono = new ImageIcon(juego.class.getResource("/icono/icono.png"));
	
	private static int aps = 0; // actualización por segundo
	private static int fps = 0; // pantalla por segundo

	private static volatile boolean enFuncionamiento = false;

	private static Thread thread;
	private static JFrame ventana;
	private static Teclado teclado;
	private static Pantalla pantalla;
	
	private static Mapa mapa;
	private static Jugador jugador;

	
	private juego() {
		setPreferredSize(new Dimension(ANCHO, ALTO));
		
		pantalla = new Pantalla(ANCHO, ALTO);
		
			
		teclado = new Teclado();
		addKeyListener(teclado);

		//mapa = new MapaGenerado(128, 128);
		mapa = new MapaCargado("/mapas/mapaDesierto.png");
		jugador = new Jugador(teclado, Sprite.ABAJO0, 225, 225);
			
		
		ventana = new JFrame(TITULO);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(false);
		ventana.setIconImage(icono.getImage());
		ventana.setLayout(new BorderLayout());
		ventana.add(this, BorderLayout.CENTER);
		ventana.setUndecorated(true);
		ventana.pack();
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
	}

	public static void main(String[] args) {
		juego juego = new juego();
		juego.iniciar();
	}

	public synchronized void iniciar() {
		enFuncionamiento = true;

		thread = new Thread(this, "Graficos");
		thread.start();
	}

	public synchronized void detener() {
		enFuncionamiento = false;
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void actualizar() {
		
		teclado.actualizar();
		
		jugador.actualizar();
		
		if(teclado.salir)
		{
			System.exit(0);
		}
		aps++; // contador del metodo
	}

	private void mostrar() {
		
		BufferStrategy estrategia = getBufferStrategy();
		
		if(estrategia == null){
			createBufferStrategy(3);
			return;
		}
		
	//	pantalla.limpiar();
		mapa.mostrar(jugador.obtenerPosicionX() - pantalla.obtenAncho()/2 + jugador.obtenSprite().obtenLado()/2,
				jugador.obtenerPosicionY()- pantalla.obtenAncho()/2 + jugador.obtenSprite().obtenLado()/2, pantalla);
		jugador.mostrar(pantalla);
		
		//copiar el array
		System.arraycopy(pantalla.pixeles, 0, pixeles, 0, pixeles.length);
		
		//copiar el array pero de forma mas costosaa
		//for(int i = 0 ; i<pixeles.length; i++){
		//	pixeles[i] = pantalla.pixeles[i];
		//}
		
		//Graphics dibujara todo lo que este dentro de estrategia
		Graphics g = estrategia.getDrawGraphics();
		
		g.drawImage(imagen, 0, 0, getWidth(), getHeight(), null);
		g.setColor(Color.RED);
		//una vez que se dibuja, dispose lo borra en el buffer
		g.drawString(CONTADOR_APS, 10, 20);
		g.drawString(CONTADOR_FPS, 10, 35);
		g.drawString("x: "+ jugador.obtenerPosicionX(),10,50);
		g.drawString("y:"+ jugador.obtenerPosicionY(),10,60);
		g.dispose();
		
		estrategia.show();
		
		fps++; // contador del metodo
		
	}

	// Procesos a ejecutar por los hilos secundarios
	@Override
	public void run() {

		// Referencia de nano segundos por segundo
		final int NS_POR_SEGUNDO = 1000000000;
		// Actualizaciónes por segundo
		final byte APS_OBJETIVO = 60;
		// Nano segundos transcurridos por actualización
		final double NS_POR_ACTUALIZACION = NS_POR_SEGUNDO / APS_OBJETIVO;
		// referencia de nano segundos(tiempo actual)
		long referenciaActualizacion = System.nanoTime();
		// referencia de nano segundos(tiempo actual)
		long referenciaContador = System.nanoTime();

		double tiempoTranscurrido;
		// Tiempo transcurrido hasta la ultima actualización
		double delta = 0;
		
		requestFocus();
		
		while (enFuncionamiento) {
			final long inicioBucle = System.nanoTime();

			tiempoTranscurrido = inicioBucle - referenciaActualizacion;

			/*
			 * asigna el tiempo de*inicioBucle para poder volver a comprar los
			 * valores dentro del ciclo while
			 */
			referenciaActualizacion = inicioBucle;

			delta += tiempoTranscurrido / NS_POR_ACTUALIZACION;

			while (delta >= 1) {
				actualizar(); // actualmente es posible que se ejecute 60ps
				delta--;
			}

			mostrar();

			if (System.nanoTime() - referenciaContador > NS_POR_SEGUNDO) {
				CONTADOR_APS = "APS: " + aps;
				CONTADOR_FPS = "FPS: " + fps;
				System.out.println(fps);
				aps = 0;
				fps = 0;
				referenciaContador = System.nanoTime();
			}
		}
	}
}
