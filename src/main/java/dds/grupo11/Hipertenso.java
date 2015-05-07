package dds.grupo11;

import java.util.Collection;
import java.util.HashSet;

public class Hipertenso implements Condicion {
	
	public boolean cumpleCondicionPreexistente(Usuario usuario){
		return usuario.tieneAlgunaComidaPreferida();
	}

	
	public boolean cumpleCondicionDeRutinaSaludable(Usuario usuario) {
		return usuario.getRutina() == "INTENSIVO";
	}

	//FIXME
	public boolean validarReceta(Receta unaReceta) {
		Collection <Ingrediente> condimentosProhibidos = new HashSet<Ingrediente>();
		Ingrediente condimentoCaldo = new Ingrediente("caldo",10);
		Ingrediente condimentoSal = new Ingrediente("sal",10);
		unaReceta.agregarCondimento(condimentoCaldo);
		unaReceta.agregarCondimento(condimentoSal);
			
		return (unaReceta.noTieneCondimentosEspecificos(condimentosProhibidos));
	} 

}
