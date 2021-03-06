package Juego;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;

import javax.swing.JFrame;

public class juego extends Canvas implements Runnable {

	private static final long serialVersionUID = 1L;

	private static final int ANCHO = 800;
	private static final int ALTO = 600;
	private static final String TITULO = "Juego";

	private static int aps = 0; // actualización por segundo
	private static int fps = 0; // pantalla por segundo

	private static volatile boolean enFuncionamiento = false;

	private static Thread thread;

	private static JFrame ventana;

	private juego() {
		setPreferredSize(new Dimension(ANCHO, ALTO));

		ventana = new JFrame(TITULO);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setResizable(false);
		ventana.setLayout(new BorderLayout());
		ventana.add(this, BorderLayout.CENTER);
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
		aps++; // contador del metodo
	}

	private void mostrar() {
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
				ventana.setTitle(TITULO + "|| APS: " + aps + "|| FPS: " + fps);
				aps = 0;
				fps = 0;
				referenciaContador = System.nanoTime();
			}
		}
	}
}
