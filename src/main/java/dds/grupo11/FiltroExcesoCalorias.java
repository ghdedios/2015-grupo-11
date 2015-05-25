package dds.grupo11;

import java.util.Collection;
import java.util.stream.Collectors;

public class FiltroExcesoCalorias extends ConsultaDecorator{

	private double sobrePeso;
	
	public FiltroExcesoCalorias(double sobrePeso,Consulta nuevaConsulta) {
		this.sobrePeso = sobrePeso;
		this.consulta = nuevaConsulta;
	}

	@Override
	public Collection<Receta> consultarRecetas(Usuario usuario) {
		
		Collection<Receta> recetasLight = this.consulta.consultarRecetas(usuario);
		if(usuario.calcularImc()>=this.sobrePeso){
			recetasLight = recetasLight.stream().filter(receta -> receta.getCalorias() <= 500).collect(Collectors.toSet());
		}
		return recetasLight;
	}

}
