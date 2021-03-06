
public abstract class clsAbsPersona {

	private String nombre;
	private String apellido;
	private int edad;
	private long dni;
	
	public clsAbsPersona(String nombre, String apellido, int edad, long dni)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
	}
	
	public abstract String getNombre();
	public abstract String getApellido();
	public abstract int getEdad();
	public abstract long getDni();
}
