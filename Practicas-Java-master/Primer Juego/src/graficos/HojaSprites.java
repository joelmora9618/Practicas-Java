package graficos;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class HojaSprites {

	private final int ancho;
	private final int alto;
	public final int[] pixeles;

	//coleccion de hojas de sprites
	public static HojaSprites desierto = new HojaSprites(
			"/texturas/desierto.png", 320, 320);
	public static HojaSprites jugador = new HojaSprites(
			"/texturas/sprite_gaspar.png", 320, 320);

	
	//fin de la colecci�n
	
	public HojaSprites(final String ruta, final int ancho, final int alto) {
		this.ancho = ancho;
		this.alto = alto;
		pixeles = new int[ancho * alto];

		BufferedImage imagen;
		try {
			imagen = ImageIO.read(HojaSprites.class.getResource(ruta));

			// (posici�n inicial de x, posici�n de y, ancho, alto, array de
			// pixeles,
			// desplazamiento correcci�n, tama�o de escaneo)
			imagen.getRGB(0, 0, ancho, alto, pixeles, 0, ancho);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public int obtenAncho()
	{
		return ancho;
	}
}
