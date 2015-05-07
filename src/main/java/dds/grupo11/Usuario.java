package dds.grupo11;

import java.time.LocalDate;
import java.util.*;
public class Usuario extends UsuarioMinimo{
	
	public Usuario(String nombre, double altura, double peso,LocalDate fechaNac, String sexo) {
		super(nombre, altura, peso, fechaNac, sexo);
		}

	//FIXME: VER EL TIPO DE LA COLECCION JUNTO CON LA QUE ESTA EN VEGANO
	private Collection <String> comidasPreferidas = new HashSet();
	//TODO: SI MODIFICAN LA DE ARRIBA MIREN ESTA TMB
	private Collection<String> comidasQueDisgustan = new HashSet();
	private Collection<Condicion> condicionesPreexistentes = new HashSet();
	private Collection<Receta> recetas = new HashSet();
	//TODO: CANBIAR POR ENUM
	private String rutina;
	
	//Todos los parametros altura sexo fehadeNac etc estan en usuarioMinimo
	
	public boolean verReceta(Receta receta){
		return !receta.esPrivada() || recetas.contains(receta);
	}
	
	//FIXME: clonar receta original 
	public void agregarRecetaModificada(Receta receta, String nombre, String dificultad, String explicacion, String temporada){
		if(verReceta(receta)){
			Receta recetaModificada = new Receta(true, nombre, dificultad, explicacion, temporada);
			agregarReceta(recetaModificada);
		}
	}
	
	public void agregarReceta(Receta receta){
		if(condicionesPreexistentes.stream().allMatch(condicion -> condicion.validarReceta(receta))){
		recetas.add(receta); 
		}
	}

	
	public boolean usuarioTieneCamposObligatorios(){
		return (this.nombre != null && this.peso > 0 && this.altura>0 && this.sexo != null && this.fechaNac != null);
		
	}
	//FIXME
	public boolean usuarioValido(){
		boolean a;
		boolean b;
		boolean c;
		a= condicionesPreexistentes.stream().
				allMatch(condicion-> condicion.cumpleCondicionPreexistente(this));
		b= nombre.length()>4;
		c= fechaNac.isBefore(LocalDate.now());
		return a&&b&&c&&usuarioTieneCamposObligatorios();
		//agregar validaciones de parametros para instanciar usuario nombre,sexo,bla bl bla
	}
	
	//Condiciones de usuario valido
	public boolean tieneAlgunaComidaPreferida(){
		return comidasPreferidas.size() > 0;	
	}
	
	public String getSexo(){
		return this.sexo;
	}
	
	public boolean noTieneCarne(Collection <String> comidasProhibidas){
		return !(comidasPreferidas.stream().anyMatch(comida->comidasProhibidas.contains(comida)));
		
	}
	//Fin de condiciones de usuario valido

	//FIXME
	public boolean sigueRutinaSaludable(){
		boolean a = calcularImc()>=18;
		boolean b = calcularImc()<=30;
		boolean c = condicionesPreexistentes.isEmpty();
		boolean d = condicionesPreexistentes.stream().allMatch(condicion->condicion.cumpleCondicionDeRutinaSaludable(this));
		return (a&&b&&(c||d));
	}
	
	public boolean subsanarDiabetes(){
		return ((peso<70) || (rutina=="INTENSIVO") || (rutina=="FUERTE"));
	}

	public boolean LeGustanLasFrutas(){
		return comidasPreferidas.contains("frutas");
	}
	
	public String getRutina(){
		return this.rutina;
	}

	public void setearRutina(String rutina) {
		this.rutina=rutina;
	}
	
	public void setearCondicion (Condicion condicion){
		condicionesPreexistentes.add(condicion);
	}

	public void setearComidaPreferida(String comida) {
		comidasPreferidas.add(comida);
		
	}

	public double getPeso() {
		return this.peso;
	}

	public Collection <Receta> getRecetas() {
		return this.recetas;
	}
}