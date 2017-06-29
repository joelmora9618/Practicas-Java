package mapa.cuadro;

import graficos.Pantalla;
import graficos.Sprite;

public class Cuadro {
	public int x;
	public int y;
	
	public Sprite sprite;
	
	public static final int LADO = 32;
	
	//Colecci�n de cuadros
	public static final Cuadro VACIO = new Cuadro(Sprite.VACIO);
	public static final Cuadro ASFALTO = new Cuadro(Sprite.ASFALTO);
	public static final Cuadro ARENA = new Cuadro(Sprite.ARENA);
	public static final Cuadro BORDE_CARRETERA = new Cuadro(Sprite.BORDE_CARRETERA);
	public static final Cuadro BORDE_CARRETERA_DERECHA = new Cuadro(Sprite.BORDE_CARRETERA_DERECHA);
	public static final Cuadro BORDE_CARRETERA_VERTICAL_ABAJO = new Cuadro(Sprite.BORDE_CARRETERA_VERTICAL_ABAJO);
	public static final Cuadro BORDE_CARRETERA_VERTICAL_ARRIBA = new Cuadro(Sprite.BORDE_CARRETERA_VERTICAL_ARRIBA);
	public static final Cuadro CENTRO_CARRETERA = new Cuadro(Sprite.CENTRO_CARRETERA);
	public static final Cuadro CENTRO_CARRETERA_HORIZONTAL = new Cuadro(Sprite.CENTRO_CARRETERA_HORIZONTAL);
	public static final Cuadro ESQUINA_CARRETERA = new Cuadro(Sprite.ESQUINA_CARRETERA);
	public static final Cuadro ESQUINA_CARRETERA_ARRIBA_IZQUIERDA = new Cuadro(Sprite.ESQUINA_CARRETERA_ARRIBA_IZQUIERDA);
	public static final Cuadro ESQUINA_CARRETERA_ARRIBA_DERECHA = new Cuadro(Sprite.ESQUINA_CARRETERA_ARRIBA_DERECHA);
	public static final Cuadro ESQUINA_CARRETERA_ABAJO_DERECHA = new Cuadro(Sprite.ESQUINA_CARRETERA_ABAJO_DERECHA);
	public static final Cuadro OXIDO = new Cuadro(Sprite.OXIDO);
	public static final Cuadro PARED_PIEDRA = new Cuadro(Sprite.PARED_PIEDRA);
	public static final Cuadro PARED_PIEDRA_CARRETERA = new Cuadro(Sprite.PARED_PIEDRA_CARRETERA);
	public static final Cuadro PARED_PIEDRA_CARRETERA_DERECHA = new Cuadro(Sprite.PARED_PIEDRA_CARRETERA_DERECHA);
	public static final Cuadro PARED_PIEDRA_INFERIOR = new Cuadro(Sprite.PARED_PIEDRA_INFERIOR);
	public static final Cuadro PUERTA_INFERIOR = new Cuadro(Sprite.PUERTA_INFERIOR);
	public static final Cuadro PUERTA_INTERMEDIA_IZQUIERDA = new Cuadro(Sprite.PUERTA_INTERMEDIA_IZQUIERDA);
	public static final Cuadro PUERTA_INTERMEDIA_DERECHA = new Cuadro(Sprite.PUERTA_INTERMEDIA_DERECHA);
	public static final Cuadro PUERTA_SUPERIOR_CENTRAL = new Cuadro(Sprite.PUERTA_SUPERIOR_CENTRAL);
	public static final Cuadro PUERTA_SUPERIOR_IZQUIERDA = new Cuadro(Sprite.PUERTA_SUPERIOR_IZQUIERDA);
	public static final Cuadro PUERTA_SUPERIOR_DERECHA = new Cuadro(Sprite.PUERTA_SUPERIOR_DERECHA);

	//fin de la colecci�n de cuadros
	
	public Cuadro(Sprite sprite)
	{
		this.sprite = sprite;
	}
	
	public void mostrar(int x, int y, Pantalla pantalla)
	{
		pantalla.mostrarCuadro(x<<5, y<<5, this);
	}
	public boolean solido()
	{
		return false;
	}
	
}
