package dds.grupo11;

import java.util.Collection; 
import java.util.HashSet;

public class Hipertenso implements Condicion {
	
	Collection <Ingrediente> condimentosProhibidos = new HashSet<Ingrediente>();
		
	public Hipertenso(){
		Ingrediente condimentoCaldo = new Ingrediente("caldo",10);
		Ingrediente condimentoSal = new Ingrediente("sal",10);
		condimentosProhibidos.add(condimentoCaldo);
		condimentosProhibidos.add(condimentoSal);
	}
	
	
	public boolean cumpleCondicionPreexistente(Usuario usuario){
		return usuario.tieneAlgunaComidaPreferida();
	}

	
	public boolean cumpleCondicionDeRutinaSaludable(Usuario usuario) {
		return usuario.getRutina().equals(EnumRutina.INTENSIVO);
	}

	//FIXME
	//Corregido
	public boolean validarReceta(Receta unaReceta) {
		return (unaReceta.noTieneCondimentosEspecificos(condimentosProhibidos));
	} 

}
