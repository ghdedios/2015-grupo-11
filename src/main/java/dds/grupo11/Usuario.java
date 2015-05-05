package dds.grupo11;

import java.time.LocalDate;
import java.util.*;
public class Usuario {
	
	private Collection <String> comidasPreferidas = new HashSet();
	private Collection<String> comidasQueDisgustan = new HashSet();
	private Collection<Condicion> condicionesPreexistentes = new HashSet();
	private Collection<Receta> recetas = new HashSet();
	private String rutina;
	
	
	//Todos los parametros altura sexo fehadeNac etc estan en usuarioMinimo
	//Hay que hacer un constructor piola en UsuarioMinimo que no rompa tests,
	//Evaluar si sexo y fechadenac van a usuario o usuarioMinimo.
	
	boolean verReceta(Receta receta){
		return !receta.esPrivada() || recetas.contains(receta);
	}
	
	void agregarRecetaModificada(Receta receta){
		if(verReceta(receta)){
			recetas.agregarRecetaPrivada(modificarReceta(receta));
		}
	}
	
	Receta modificarReceta(Receta receta){
		
		Receta recetaAAgregar = new Receta(true,receta.getNombre(),receta.getDificultad(),receta.getExplicacion(),receta.getTemporada());
		return recetaAAgregar;
	}
}
