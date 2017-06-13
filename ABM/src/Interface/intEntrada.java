package Interface;
import java.util.List;

import Model.clsContactoPersona;

public interface intEntrada 
{
	void ConsultarDatos(List<clsContactoPersona>ListaPersonas);
	void BorrarUsuario(long dni, List<clsContactoPersona>ListaPersonas);
}
