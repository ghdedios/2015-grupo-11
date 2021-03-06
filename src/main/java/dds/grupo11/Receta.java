package dds.grupo11;

import java.util.Collection; 
import java.util.HashSet;
import java.util.stream.Collectors;

public class Receta {
	
	public Receta(boolean privada, String nombre, EnumDificultadReceta dificultad, String explicacion, EnumTemporadaReceta temporada){
		asignarValores(privada,nombre,dificultad,explicacion,temporada);
	}
	private boolean esPrivada;
	private Collection <Receta> subrecetas = new HashSet<Receta>();
	private Collection <Ingrediente> ingredientes = new HashSet<Ingrediente>();
	private Collection <Ingrediente> ingredientesCaros = new HashSet<Ingrediente>();
	private Collection <Ingrediente> condimentos = new HashSet<Ingrediente>();
	private String nombreDelPlato;
	private String explicacion;
	private EnumTemporadaReceta temporada;
	private EnumDificultadReceta dificultad;
	private double totalCalorias;
	
	
	
	//=================================================================
	//METODOS ENTREGA 1
	//=================================================================
	
	public void asignarValores(boolean privada, String nombre, EnumDificultadReceta dificultad, String explicacion, EnumTemporadaReceta temporada){
		this.esPrivada=privada;
		this.nombreDelPlato=nombre;
		this.dificultad=dificultad;
		this.explicacion=explicacion;	
		this.temporada=temporada;
	}
	
	public boolean esValida(){
		return (this.totalCalorias>10 && this.totalCalorias<5000 && this.ingredientes.size()>0);
	}
	
	

	public double cantidadDeAzucar(){
		return condimentos.stream().filter(condimento -> condimento.getNombre().equals("Azucar")).findFirst().get().getCantidad();
	}
	

	public boolean noTieneCondimentosEspecificos(Collection<Ingrediente> condimentos) {
		return !(this.condimentos.stream().anyMatch(condimento->condimentos.contains(condimento)));
	}

	//=================================================================
	//Fin METODOS ENTREGA 1
	//=================================================================
	
	
	//=================================================================
	// GETTERS Y SETTERS
	//=================================================================
	
	public Collection<String> getnombreDeIngredientes() {
		return ingredientes.stream().map(Ingrediente::getNombre).collect(Collectors.toList());
	}
	
	public void agregarIngrediente(Ingrediente ingrediente){
		this.ingredientes.add(ingrediente);
	}
	
	public void agregarCondimento(Ingrediente condimento){
		this.condimentos.add(condimento);
	}
	
	public void agregarSubreceta(Receta subrecetaReutilizable) {
		this.subrecetas.add(subrecetaReutilizable);
		
	}
	
	public Collection<Receta> getSubrecetas() {
		return this.subrecetas;
	}
	
	public boolean esPrivada(){
		return this.esPrivada;
	}

	public String getNombre() {
		return this.nombreDelPlato;
	}

	public EnumDificultadReceta getDificultad() {
		return this.dificultad;
	}

	public String getExplicacion() {
		return this.explicacion;
	}

	public EnumTemporadaReceta getTemporada() {
		return this.temporada;
	}
	
	public Collection<Ingrediente> getIngredientes(){
		return this.ingredientes;
	}
	
	public double getCalorias(){
		return this.totalCalorias;
	}

	public boolean tieneIngredientesCaros() {
		return this.ingredientesCaros.size() > 0;
	}
	
	public void setTotalCalorias(double calorias){
		this.totalCalorias = calorias;
	}
}
	//=================================================================
	//Fin GETTERS Y SETTERS
	//=================================================================
