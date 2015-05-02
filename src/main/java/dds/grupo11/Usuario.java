package dds.grupo11;

import java.time.LocalDate;
import java.util.*;
public class Usuario {
	
	private String nombre;
	private double altura;
	private double peso;
	private LocalDate fechaNac;
	private int sexo;
	private Collection <String> comidasPreferidas = new HashSet();
	private Collection<String> comidasQueDisgustan = new HashSet();
	private Collection<Condicion> condicionesPreexistentes = new HashSet();
	private Collection<Receta> recetas = new HashSet();
	private String rutina;
	
	
	
	public Usuario (double altura, double peso){
		this.altura = altura;
		this.peso = peso;
		
	}
	
	public double altura(){
		return this.altura;
	}
	public double peso(){
		return this.peso;
	}

	public double calularIndiceDeMasaCorporal(){
		return this.peso/(this.altura*this.altura);
	}
	
	
}
