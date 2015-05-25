package dds.grupo11;

import java.util.Collection;

public interface Consulta {
	
	public Collection<Receta> consultarRecetas(Usuario usuario);
}
