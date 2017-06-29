package abm_fun;
import java.util.List;

import Interface.intEntrada;
import Model.clsContactoPersona;

public class clsBajaPersonas implements intEntrada
{
	@Override
	public void ConsultarDatos(List<clsContactoPersona> ListaPersonas) {
		// TODO Auto-generated method stub
	}

	@Override
	public void BorrarUsuario(long dni, List<clsContactoPersona> ListaPersonas) 
	{
		boolean encontrado = false;
		int i = 0;
		try
		{
			while(encontrado == false && i<ListaPersonas.size()){
				if(ListaPersonas.get(i).getDni() == dni)
				{
					encontrado = true;
				}else
				{
					i++;
				}
			}
			if(encontrado)
			{
				ListaPersonas.remove(ListaPersonas.get(i));
				System.out.println("Usuario eliminado con exito!");
			}else
			{
				System.out.println("no se ah encontrado el usuario ingresado!");
			}
		}
		catch(Exception e)
		{
			throw e;
		}
	}

}
