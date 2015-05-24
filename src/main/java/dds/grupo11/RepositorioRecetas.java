package dds.grupo11;

import java.util.Collection;

public interface RepositorioRecetas {
	
	public abstract void agregar();
	public abstract void quitar();
	public abstract Collection<Receta> listarTodas();

}
