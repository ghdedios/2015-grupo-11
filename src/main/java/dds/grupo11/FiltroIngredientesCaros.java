package dds.grupo11;

import java.util.Collection;
import java.util.stream.Collectors;

public class FiltroIngredientesCaros extends ConsultaDecorator {
	
	public FiltroIngredientesCaros(Consulta nuevaConsulta){
		this.consulta = nuevaConsulta;
	}

	@Override
	public Collection<Receta> consultarRecetas(Usuario usuario) {
		return this.consulta.consultarRecetas(usuario)
				.stream().filter(receta -> !receta.tieneIngredientesCaros()).collect(Collectors.toSet());
		}

}
