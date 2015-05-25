package dds.grupo11;

import java.util.Collection;
import java.util.stream.Collectors;

public class FiltroGustoUsuario extends ConsultaDecorator {
	
	public FiltroGustoUsuario(Consulta nuevaConsulta){
		this.consulta = nuevaConsulta;
	}
	
	@Override
	public Collection<Receta> consultarRecetas(Usuario usuario) {
		return this.consulta.consultarRecetas(usuario).stream().
				filter(receta -> usuario.noComparteComidasQueLeDisgustanConReceta(receta)).collect(Collectors.toSet());
	}

}
