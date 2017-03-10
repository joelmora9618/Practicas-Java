import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program 
{
	public static void main(String[] args)
	{
		List<clsContactoPersona>ListaPersonas = new ArrayList<>(); 
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader buffer = new BufferedReader(in);
		char continuar = 's';
		String value;
		int opcion;
		long dniAux = 0;
		intEntrada Entrada;
		intSalida Salida;
		Scanner scan = new Scanner(System.in);
		
		while(continuar == 's')
		{
			System.out.println("1 Alta persona");
			System.out.println("2 Borrar persona");
			System.out.println("3 Modificar persona");
			System.out.println("4 Mostrar lista");
			System.out.println("5 Salir");
			
			System.out.println("\nQue operacion desea realizar?: ");
			opcion = scan.nextInt();
			
			switch(opcion)
			{
				case 1:
					try
					{
						Entrada = new clsAltaPersona();
						Entrada.ConsultarDatos(ListaPersonas);
						System.out.println("\nUsuario ingresado exitosamente!\n");
					}
					catch(Exception e)
					{
						System.out.println("\nError ingresando al usuario!\n" + e.getMessage());
					}
					System.out.flush();
					break;
				case 2:
					try {
					Entrada = new clsBajaPersonas();
					System.out.println("ingrese el DNI del usuario a borrar: ");				
					value = buffer.readLine();
					dniAux = Long.parseLong(value);
					Entrada.BorrarUsuario(dniAux, ListaPersonas);
				} catch (Exception e) {
					System.out.println("Error al borrar al usuario\n" + e.getMessage());
				}
					System.out.flush();
					break;
				case 3:
					break;
				case 4:
					Salida = new clsImprimir();
					Salida.ImprimirDatos(ListaPersonas);
					System.out.flush();
					break;
				case 5:
					System.out.println("Gracias vuelva prontos!");
					continuar = 'n';
					System.out.close();
					break;
				default:
					System.out.println("Opcion invalida!");
				try {
					Runtime.getRuntime().exec("cls");
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					break;
			}
		}
		
	}
}
