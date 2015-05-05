package dds.grupo11;

import java.time.LocalDate;
import java.util.*;
public class Usuario extends UsuarioMinimo{
	
	public Usuario(String nombre, double altura, double peso,LocalDate fechaNac, String sexo) {
		super(nombre, altura, peso, fechaNac, sexo);
		}

	private Collection <String> comidasPreferidas = new HashSet();
	private Collection<String> comidasQueDisgustan = new HashSet();
	private Collection<Condicion> condicionesPreexistentes = new HashSet();
	private Collection<Receta> recetas = new HashSet();
	private String rutina;
	
	//Todos los parametros altura sexo fehadeNac etc estan en usuarioMinimo
	//Hay que hacer un constructor piola en UsuarioMinimo que no rompa tests,
	//Evaluar si sexo y fechadenac van a usuario o usuarioMinimo.
	
	public boolean verReceta(Receta receta){
		return !receta.esPrivada() || recetas.contains(receta);
	}
	
	public void agregarRecetaModificada(Receta receta){
		if(verReceta(receta)){
			agregarRecetaPrivada(modificarReceta(receta));
		}
	}
	
	Receta modificarReceta(Receta receta){
		Receta recetaAAgregar = new Receta(true,receta.getNombre(),receta.getDificultad(),receta.getExplicacion(),receta.getTemporada());
		return recetaAAgregar;
	}
	
	public void agregarRecetaPrivada(Receta receta){
		recetas.add(receta);
	}
	
	public boolean usuarioValido(){
		boolean a;
		boolean b;
		boolean c;
		a= condicionesPreexistentes.stream().allMatch(condicion-> condicion.cumpleCondicionPreexistente(this));
		b= nombre.length()>4;
		c= fechaNac.isBefore(LocalDate.now());
		return a&&b&&c;
	}
	
	
	//Condiciones de usuario valido
	public boolean tieneAlgunaComidaPreferida(){
		return comidasPreferidas.size() > 0;
			
	}
	
	public boolean indicaSexo(){
		return sexo()!=null;
	}
	
	public boolean noTieneCarne(Collection <String> comidasProhibidas){
		return !(comidasPreferidas.stream().anyMatch(comida->comidasProhibidas.contains(comida)));
		
	}
	//Fin de condiciones de usuario valido
}