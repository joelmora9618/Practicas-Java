import java.util.List;
import java.util.Scanner;
import java.io.*;

public class clsAltaPersona implements intEntrada
{
	private clsContactoPersona Persona;
	
	public void ConsultarDatos(List<clsContactoPersona>ListaPersonas)
	{
		try
		{
			InputStreamReader in = new InputStreamReader(System.in);
			BufferedReader buffer = new BufferedReader(in);
			Scanner scan = new Scanner(System.in);
			String value, nombre = "",apellido = "",telefono1 = "",
				   telefono2 = "",email = "",localidad = "",
				   calle = "";
			
			int edad = 0;
			long dni = 0;
			
			System.out.println("ingrese su nombre: ");
			nombre = buffer.readLine();
			
			System.out.println("ingrese su apellido: ");
			apellido = buffer.readLine();
			
			System.out.print("ingrese su edad: ");
			value = buffer.readLine();
			edad = Integer.parseInt(value);
			
			System.out.println("ingrese su dni: ");
			value = buffer.readLine();
			dni = Long.parseLong(value);
			
			Persona = new clsContactoPersona(nombre, apellido, edad, dni, telefono1, telefono2, email, localidad, calle);
			ListaPersonas.add(Persona);
		}
		catch(Exception e)
		{
			try {
				throw e;
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}

	}

	@Override
	public void BorrarUsuario(long dni, List<clsContactoPersona> ListaPersonas) {
		// TODO Auto-generated method stub
		
	}
}
