import java.io.Serializable;

public class clsDireccionesPersona implements Serializable
{
	private String localidad;
	private String calle;
	
	public clsDireccionesPersona()
	{
		this.localidad = localidad;
		this.calle = calle;
	}
	
	public String getLocalidad()
	{
		return this.localidad;
	}
	public String setLocalidad(String value)
	{
		return this.localidad = value;
	}
	public String getCalle()
	{
		return this.calle;
	}
	public String setCalle(String value)
	{
		return this.calle = value;
	}
}
