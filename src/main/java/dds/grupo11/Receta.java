package dds.grupo11;

import java.util.Collection;
import java.util.HashSet;

public class Receta {

	private boolean esPrivada;
	private Collection <Receta> subrecetas = new HashSet<Receta>();
	private Collection <Ingrediente> ingredientes = new HashSet<Ingrediente>();
	private Collection <Ingrediente> condimentos = new HashSet<Ingrediente>();
	private String nombreDelPlato;
	private String explicacion;
	public enum Temporada{OTONIO,INVIERNO,PRIMAVERA,VERANO,TODO_EL_ANIO}
	private Temporada temporada;
	
	public enum Dificultad{BAJA,MEDIA,ALTA,MUY_ALTA}
	private Dificultad dificultad;
	private double totalCalorias;
	
	public Receta(boolean privada, String nombre, Dificultad dificultad, String explicacion, Temporada temporada){
		asignarValores(privada,nombre,dificultad,explicacion,temporada);
	}
	
	public void asignarValores(boolean privada, String nombre, Dificultad dificultad, String explicacion, Temporada temporada){
		this.esPrivada=privada;
		this.nombreDelPlato=nombre;
		this.dificultad=dificultad;
		this.explicacion=explicacion;	
		this.temporada=temporada;
	}
	
	public boolean esValida(){
		return (this.totalCalorias>10 && this.totalCalorias<5000 && this.ingredientes.size()>0);
	}

	public boolean esPrivada(){
		return this.esPrivada;
	}

	public String getNombre() {
		return this.nombreDelPlato;
	}

	public Dificultad getDificultad() {
		return this.dificultad;
	}

	public String getExplicacion() {
		return this.explicacion;
	}

	public Temporada getTemporada() {
		return this.temporada;
	}

	public double cantidadDeAzucar(){
		return condimentos.stream().filter(condimento -> condimento.getNombre().equals("Azucar")).findFirst().get().getCantidad();
	}
	
	public void agregarIngrediente(Ingrediente ingrediente){
		this.ingredientes.add(ingrediente);
	}
	
	public void agregarCondimento(Ingrediente condimento){
		this.condimentos.add(condimento);
	}

	public boolean noTieneCondimentosEspecificos(Collection<Ingrediente> condimentos) {
		return !(this.condimentos.stream().anyMatch(condimento->condimentos.contains(condimento)));
	}

	public void agregarSubreceta(Receta subrecetaReutilizable) {
		this.subrecetas.add(subrecetaReutilizable);
		
	}

	public Collection<Receta> getSubrecetas() {
		return this.subrecetas;
	}
}