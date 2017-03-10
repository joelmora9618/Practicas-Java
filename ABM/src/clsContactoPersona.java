import java.io.Serializable;

public class clsContactoPersona extends clsBasePersona implements Serializable
{
	private String telefono1;
	private String telefono2;
	private String email;
	private clsDireccionesPersona direcciones;
	
	
	public clsContactoPersona(String nombre, String apellido, int edad, long dni,
							  String telefono1, String telefono2, String email,
							  String localidad,String calle)
	{
		super(nombre, apellido, edad, dni);
		this.telefono1 = telefono1;
		this.telefono2 = telefono2;
		this.email = email;
		this.direcciones = new clsDireccionesPersona();
		this.direcciones.setLocalidad(localidad);
		this.direcciones.setCalle(calle);
	}

	public String getTelefono1()
	{
		return this.telefono1;
	}
	public String getTelefono2()
	{
		return this.telefono2;
	}
	public String getEmail()
	{
		return this.email;
	}
	public clsDireccionesPersona getDirecciones()
	{
		return this.direcciones;
	}
	
}
