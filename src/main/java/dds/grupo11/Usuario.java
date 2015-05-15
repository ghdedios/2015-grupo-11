package dds.grupo11;

import java.time.LocalDate; 
import java.util.*;
public class Usuario extends UsuarioMinimo{
	
	public Usuario(String nombre, double altura, double peso,LocalDate fechaNac, String sexo) {
		super(nombre, altura, peso, fechaNac, sexo);
		}


	private Collection <Ingrediente> comidasPreferidas = new HashSet<Ingrediente>();
	private Collection<Ingrediente> comidasQueDisgustan = new HashSet<Ingrediente>();
	private Collection<Condicion> condicionesPreexistentes = new HashSet<Condicion>();
	private Collection<Receta> recetas = new HashSet<Receta>();
	private EnumRutina rutina; 
	
	public boolean sugerir(Receta receta){
		return noComparteComidasQueLeDisgustanConReceta(receta) && cumpleCondicionesValidas(receta);
	}


	public boolean noComparteComidasQueLeDisgustanConReceta(Receta receta) {
		return !this.comidasQueDisgustan.stream().anyMatch
				(comidaFea -> (receta.getIngredientes().stream().map(ingrediente -> ingrediente.getNombre()).anyMatch
						(nombreIngrediente -> nombreIngrediente.equalsIgnoreCase(comidaFea.getNombre()))));
	};

	

	//=================================================================
	//METODOS ENTREGA 1
	//=================================================================
	
	public boolean verReceta(Receta receta){
		return !receta.esPrivada() || recetas.contains(receta);
	}
	
	//FIXME: clonar receta original 
	public void agregarRecetaModificada(Receta receta, String nombre, EnumDificultadReceta dificultad, String explicacion, EnumTemporadaReceta temporada){
		if(verReceta(receta)){
			Receta recetaModificada = receta;
			recetaModificada.asignarValores(true, nombre, dificultad, explicacion, temporada);
			agregarReceta(recetaModificada);
		}
	}
	
	public void agregarReceta(Receta receta){
		if(cumpleCondicionesValidas(receta)){
		recetas.add(receta); 
		}
	}

	public boolean cumpleCondicionesValidas(Receta receta) {
		return condicionesPreexistentes.stream().allMatch(condicion -> condicion.validarReceta(receta));
	}
	
	public boolean usuarioValido(){
		return usuarioCumpleCondicionesPreexistentes() &&
		nombre.length()>4 &&
		fechaNac.isBefore(LocalDate.now()) &&
		this.usuarioTieneCamposObligatorios();
	}
	
	public boolean usuarioCumpleCondicionesPreexistentes(){
		return condicionesPreexistentes.stream().allMatch(condicion-> condicion.cumpleCondicionPreexistente(this));
	}
	
	//Condiciones de usuario valido
	public boolean tieneAlgunaComidaPreferida(){
		return comidasPreferidas.size() > 0;	
	}
	
	
	public boolean noComeAnimales(Collection <Ingrediente> comidasProhibidas){
		return (comidasPreferidas.stream().filter(comida -> comidasProhibidas.contains(comida))).count() > 0;
	}
	//Fin de condiciones de usuario valido


	public boolean sigueRutinaSaludable(){
		return calcularImc()>=18 && calcularImc()<=30 &&
		 (condicionesPreexistentes.isEmpty() || cumpleTodasLasCondiciones());
	}

	public boolean cumpleTodasLasCondiciones() {
		return condicionesPreexistentes.stream().allMatch(condicion->condicion.cumpleCondicionDeRutinaSaludable(this));
	}
	
	public boolean subsanarDiabetes(){
		return ((peso<70) || (this.rutina.equals(EnumRutina.INTENSIVO) || (this.rutina.equals(EnumRutina.FUERTE))));
	}

	public boolean LeGustanLasFrutas(){
		return comidasPreferidas.stream().map(ingrediente -> ingrediente.getNombre()).anyMatch(nombre -> nombre.equals("frutas"));
	}
	
	
	//=================================================================
	//Fin METODOS ENTREGA 1
	//=================================================================
	
	
	//=================================================================
	// GETTERS Y SETTERS
	//=================================================================
	
	public String getSexo(){
		return this.sexo;
	}
	
	public EnumRutina getRutina(){
		return this.rutina;
	}

	public void setearRutina(EnumRutina rutina) {
		this.rutina=rutina;
	}
	

	
	public void setearCondicion (Condicion condicion){
		condicionesPreexistentes.add(condicion);
	}

	public void setearComidaPreferida(Ingrediente comida) {
		comidasPreferidas.add(comida);
	}

	public void setearComidaQueLeDisgusta(Ingrediente comida) {
		comidasQueDisgustan.add(comida);
	}
	
	public double getPeso() {
		return this.peso;
	}

	public Collection <Receta> getRecetas() {
		return this.recetas;
	}
	
	public Collection<Ingrediente> getComidasFeas(){
		return this.comidasQueDisgustan;
	}
	//=================================================================
	//Fin GETTERS Y SETTERS
	//=================================================================

}