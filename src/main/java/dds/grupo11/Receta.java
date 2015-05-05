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
	
	public Receta(boolean privada, String nombre, String dificultad, String explicacion, String temporada){
		this.esPrivada=privada;
		this.nombreDelPlato=nombre;
		this.dificultad=dificultad;
		this.explicacion=explicacion;
		this.temporada=temporada;
	}
	
	public boolean esValida(){
		return (this.totalCalorias()>10 && this.totalCalorias()<5000 && this.ingredientes.size()>0);
	}

	private int totalCalorias() {
		// TODO Auto-generated method stub
		return 0;
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
}