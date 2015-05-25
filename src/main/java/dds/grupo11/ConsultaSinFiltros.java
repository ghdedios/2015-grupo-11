package dds.grupo11;

import java.util.Collection;
import java.util.stream.Collectors;

public class ConsultaSinFiltros implements Consulta {

	@Override
	public Collection<Receta> consultarRecetas(Usuario usuario) {
		return (usuario.getRecetas()).stream().filter(receta -> usuario.verReceta(receta)).collect(Collectors.toSet());
	}

}