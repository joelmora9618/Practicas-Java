package Model;
public class clsBasePersona extends clsAbsPersona 
{
	private String nombre;
	private String apellido;
	private int edad;
	private int dni;

	public clsBasePersona(String nombre, String apellido, int edad, int dni) {
		super(nombre, apellido, edad, dni);
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dni = dni;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public String getApellido() {
		// TODO Auto-generated method stub
		return this.apellido;
	}

	@Override
	public int getEdad() {
		// TODO Auto-generated method stub
		return this.edad;
	}

	@Override
	public int getDni() {
		// TODO Auto-generated method stub
		return this.dni;
	}
	
}
