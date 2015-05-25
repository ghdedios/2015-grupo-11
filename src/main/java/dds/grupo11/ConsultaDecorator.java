package dds.grupo11;

import java.util.Collection;

public abstract class ConsultaDecorator implements Consulta {
	
	protected Consulta consulta;
	
	public abstract Collection<Receta> consultarRecetas(Usuario usuario);
}
