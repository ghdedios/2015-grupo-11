package dds.grupo11;

import java.util.Collection;
import java.util.HashSet;


public class Vegano implements Condicion {
	
	private Collection <Ingrediente> comidasProhibidas = new HashSet<Ingrediente>();
	
	public Vegano(){
		Ingrediente pollo = new Ingrediente ("pollo",1,"kilo");
		Ingrediente carne = new Ingrediente ("carne",1,"kilo");
		Ingrediente chivito = new Ingrediente ("chivito",10,"kilos");
		Ingrediente chori = new Ingrediente ("chori",1,"kilo");
		comidasProhibidas.add(pollo);
		comidasProhibidas.add(carne);
		comidasProhibidas.add(chivito);
		comidasProhibidas.add(chori);
	}
	
	public boolean cumpleCondicionPreexistente(Usuario usuario){
		return (usuario.noComeAnimales(comidasProhibidas));
	}

	public boolean cumpleCondicionDeRutinaSaludable(Usuario usuario) {
		return usuario.LeGustanLasFrutas();
	}

	public boolean validarReceta(Receta unaReceta) {
		return unaReceta.noTieneCondimentosEspecificos(comidasProhibidas);
	}
}