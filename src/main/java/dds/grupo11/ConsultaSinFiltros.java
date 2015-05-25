package dds.grupo11;

import java.util.Collection;
import java.util.stream.Collectors;

public class ConsultaSinFiltros implements Consulta {
	
	private RepositorioRecetas repositorio; 
	
	public ConsultaSinFiltros(RepositorioRecetas repo){
		this.repositorio=repo;
	}
			
	public Collection<Receta> recetasRepositorio;

	public void GetRecetasRepositorio(){
		this.recetasRepositorio = repositorio.listarTodas();
	}
	
	@Override
	public Collection<Receta> consultarRecetas(Usuario usuario) {
		return (recetasRepositorio.stream().filter(receta -> usuario.verReceta(receta))).collect(Collectors.toSet());
	}

}
