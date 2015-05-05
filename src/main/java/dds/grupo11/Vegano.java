package dds.grupo11;

import java.util.Collection;
import java.util.HashSet;

public class Vegano implements Condicion {
	
	public boolean cumpleValidez(Usuario usuario){
		Collection <String> comidasProhibidas = new HashSet();
		comidasProhibidas.add("pollo");
		comidasProhibidas.add("carne");
		comidasProhibidas.add("chivito");
		comidasProhibidas.add("chori");
		
		if(usuario.noTieneCarne(comidasProhibidas)) {
			return true;
		} else {
			return false;
		}
	}
}
