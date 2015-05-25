package dds.grupo11;

import java.util.Collection;
import java.util.stream.Collectors;

public class FiltroCondicionesPreexistentesUsuario extends ConsultaDecorator {

	public FiltroCondicionesPreexistentesUsuario(Consulta nuevaConsulta) {
		this.consulta = nuevaConsulta;
	}
	
	@Override
	public Collection<Receta> consultarRecetas(Usuario usuario) {
		return this.consulta.consultarRecetas(usuario)
				.stream().filter(receta -> usuario.cumpleCondicionesValidas(receta)).collect(Collectors.toSet());
	}

}