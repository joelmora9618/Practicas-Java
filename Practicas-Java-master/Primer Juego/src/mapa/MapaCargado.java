package mapa;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import mapa.cuadro.Cuadro;

public class MapaCargado extends Mapa {

	private int[] pixeles;
	
	public MapaCargado(String ruta) {
		super(ruta);
	}
	
	protected void cargarMapa(String ruta)
	{
		try {
			BufferedImage imagen = ImageIO.read(MapaCargado.class.getResource(ruta));
			
			ancho = imagen.getWidth();
			alto = imagen.getHeight();
		
			cuadrosCatalogos = new Cuadro[ancho * alto];
			pixeles = new int[ancho * alto];
			
			imagen.getRGB(0, 0, ancho, alto, pixeles,0, ancho);
			
		} catch (IOException e) {
		// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void generarMapa()
	{
		for(int i = 0; i<pixeles.length;i++)
		{
			switch(pixeles[i])
			{
			case 0xff4e4e4e:
				cuadrosCatalogos[i] = Cuadro.ASFALTO;
				continue;
			case 0xfffdc97f:
				cuadrosCatalogos[i] = Cuadro.ARENA;
				continue;
			case 0xff818181:
				cuadrosCatalogos[i] = Cuadro.BORDE_CARRETERA;
				continue;
			case 0xff817373:
				cuadrosCatalogos[i] = Cuadro.BORDE_CARRETERA_DERECHA;
				continue;
			case 0xffa46969:
				cuadrosCatalogos[i] = Cuadro.BORDE_CARRETERA_VERTICAL_ABAJO;
				continue;
			case 0xff7f5e5e:
				cuadrosCatalogos[i] = Cuadro.BORDE_CARRETERA_VERTICAL_ARRIBA;
				continue;
			case 0xfffee5d0:
				cuadrosCatalogos[i] = Cuadro.CENTRO_CARRETERA;
				continue;
			case 0xffe3d4c8:
				cuadrosCatalogos[i] = Cuadro.CENTRO_CARRETERA_HORIZONTAL;
				continue;
			case 0xffe7c2a3:
				cuadrosCatalogos[i] = Cuadro.ESQUINA_CARRETERA;
				continue;
			case 0xffd98f50:
				cuadrosCatalogos[i] = Cuadro.ESQUINA_CARRETERA_ARRIBA_IZQUIERDA;
				continue;
			case 0xffe9ac78:
				cuadrosCatalogos[i] = Cuadro.ESQUINA_CARRETERA_ARRIBA_DERECHA;
				continue;
			case 0xffd1a580:
				cuadrosCatalogos[i] = Cuadro.ESQUINA_CARRETERA_ABAJO_DERECHA;
				continue;
			case 0xffbebebe:
				cuadrosCatalogos[i] = Cuadro.PARED_PIEDRA;
				continue;
			case 0xffaba16a:
				cuadrosCatalogos[i] = Cuadro.PARED_PIEDRA_INFERIOR;
				continue;
			case 0xffcbc084:	
				cuadrosCatalogos[i] = Cuadro.PARED_PIEDRA_CARRETERA;
				continue;
			case 0xffdecb5d:
				cuadrosCatalogos[i] = Cuadro.PARED_PIEDRA_CARRETERA_DERECHA;
				continue;
			case 0xff8b5822:
				cuadrosCatalogos[i] = Cuadro.PUERTA_INFERIOR;
				continue;
			case 0xffa2682a:
				cuadrosCatalogos[i] = Cuadro.PUERTA_INTERMEDIA_IZQUIERDA;
				continue;
			case 0xff442d15:
				cuadrosCatalogos[i] = Cuadro.PUERTA_INTERMEDIA_DERECHA;
				continue;
			case 0xffbe7a31:
				cuadrosCatalogos[i] = Cuadro.PUERTA_SUPERIOR_IZQUIERDA;
				continue;
			case 0xff846543:
				cuadrosCatalogos[i] = Cuadro.PUERTA_SUPERIOR_DERECHA;
				continue;
			case 0xff6b441a:
				cuadrosCatalogos[i] = Cuadro.PUERTA_SUPERIOR_CENTRAL;
				continue;
			case 0xff5a2c0e:
				cuadrosCatalogos[i] = Cuadro.OXIDO;
				continue;	
			default:
				cuadrosCatalogos[i] = Cuadro.VACIO;
				
			}
		}
	}

}
