package dds.grupo11;

import java.util.Collection;
import java.util.HashSet;


public class MockRepositorio implements RepositorioRecetas {
	
	private Collection<Receta> recetasDelSistema = new HashSet<Receta>();
	
	@Override
	public void agregar(Receta receta) {
		this.recetasDelSistema.add(receta);
	}

	@Override
	public void quitar(Receta receta) {
		this.recetasDelSistema.remove(receta);
	}

	@Override
	public Collection<Receta> listarTodas() {
		return recetasDelSistema;
	}
	
	public Collection<Receta> getRecetasDelSistema(){
		return this.recetasDelSistema;
	}
	
}
