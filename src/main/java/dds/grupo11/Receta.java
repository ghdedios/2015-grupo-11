package dds.grupo11;

import java.util.Collection;
import java.util.HashSet;

public class Receta {

	private boolean esPrivada;
	private Collection <Receta> subreceta = new HashSet();
	private Collection <Ingrediente> ingredientes = new HashSet();
	private Collection <Ingrediente> condimentos = new HashSet();
	private String nombreDelPlato;
	private String explicacion;
	private String temporada;
	private String dificultad;
	private double totalCalorias;
	
	public Receta(boolean privada, String nombre, String dificultad, String explicacion, String temporada){
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

	public String getDificultad() {
		return this.dificultad;
	}

	public String getExplicacion() {
		return this.explicacion;
	}

	public String getTemporada() {
		return this.temporada;
	}

	/*public boolean cantidadDeAzucar() {
		return condimentos.stream().anyMatch(condimento -> (condimento.getNombre() && condimento.getCantidad()>100));
	}*/
	
	public double cantidadDeAzucar(){
		return condimentos.stream().filter(condimento -> condimento.getNombre() == "Azucar").findFirst().get().getCantidad();
	}
	
	public void agregarIngrediente(Ingrediente ingrediente){
		this.ingredientes.add(ingrediente);
	}
	
	public void agregarCondimento(Ingrediente condimento){
		this.condimentos.add(condimento);
	}
	


}