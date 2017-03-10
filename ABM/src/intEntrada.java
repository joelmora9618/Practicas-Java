import java.util.List;

public interface intEntrada 
{
	void ConsultarDatos(List<clsContactoPersona>ListaPersonas);
	void BorrarUsuario(long dni, List<clsContactoPersona>ListaPersonas);
}
