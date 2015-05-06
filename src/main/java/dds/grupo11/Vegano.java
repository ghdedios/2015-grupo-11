package dds.grupo11;

import java.util.Collection;
import java.util.HashSet;

public class Vegano implements Condicion {
	
	public boolean cumpleCondicionPreexistente(Usuario usuario){
		Collection <String> comidasProhibidas = new HashSet<String>();
		comidasProhibidas.add("pollo");
		comidasProhibidas.add("carne");
		comidasProhibidas.add("chivito");
		comidasProhibidas.add("chori");
		
		return (usuario.noTieneCarne(comidasProhibidas));

	}

	public boolean cumpleCondicionDeRutinaSaludable(Usuario usuario) {
		return usuario.LeGustanLasFrutas();
	}

	@Override
	public boolean validarReceta(Receta unaReceta) {
		// TODO Auto-generated method stub
		return false;
	}
}