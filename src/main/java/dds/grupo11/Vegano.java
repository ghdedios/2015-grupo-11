package dds.grupo11;

import java.util.Collection;
import java.util.HashSet;

public class Vegano implements Condicion {
	
	private Collection <String> comidasProhibidas = new HashSet<String>();
	
	public Vegano(){
		comidasProhibidas.add("pollo");
		comidasProhibidas.add("carne");
		comidasProhibidas.add("chivito");
		comidasProhibidas.add("chori");
	}
	
	public boolean cumpleCondicionPreexistente(Usuario usuario){
		return (usuario.noTieneCarne(comidasProhibidas));
	}

	public boolean cumpleCondicionDeRutinaSaludable(Usuario usuario) {
		return usuario.LeGustanLasFrutas();
	}

	public boolean validarReceta(Receta unaReceta) {
		return false;
		//	return !(this.condimentos.stream().anyMatch(condimento->condimentos.contains(condimento)));
	}
}