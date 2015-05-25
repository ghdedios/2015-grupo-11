package dds.grupo11;

import java.util.Collection;

public interface RepositorioRecetas {
	
	public abstract void agregar(Receta receta);
	public abstract void quitar(Receta receta);
	public abstract Collection<Receta> listarTodas();

}
