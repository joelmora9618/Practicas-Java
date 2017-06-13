import java.util.List;

public class clsImprimir implements intSalida
{
	public void ImprimirDatos(List<clsContactoPersona>ListaPersonas)
	{
		System.out.println("NOMBRE\tAPELLIDO\tEDAD\tDNI");
		for (clsContactoPersona Persona : ListaPersonas)
		{
			System.out.println(Persona.getNombre() + "\t" + Persona.getApellido()+"\t\t"+
							   Persona.getEdad() + "\t" + Persona.getDni());
		}
		System.out.println("\n");
	}
}

