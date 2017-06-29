package Model;

public abstract class clsAbsPersona {

	private String nombre;
	private String apellido;
	private int edad;
	private int dni;
	
	public clsAbsPersona(String nombre, String apellido, int edad, int dni)
	{
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
	}
	
	public abstract String getNombre();
	public abstract String getApellido();
	public abstract int getEdad();
	public abstract int getDni();
}
