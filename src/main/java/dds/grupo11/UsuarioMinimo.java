package dds.grupo11;

import java.time.LocalDate;

public class UsuarioMinimo {
	
	protected String nombre;
	protected double altura;
	protected double peso;
	protected LocalDate fechaNac;
	protected String sexo;
	

	public UsuarioMinimo (String nombre, double altura, double peso,LocalDate fechaNac, String sexo){
		this.nombre = nombre;
		this.altura = altura;
		this.peso = peso;
		this.fechaNac = fechaNac;
		this.sexo = sexo;
	}
	
	public double altura(){
		return this.altura;
	}
	
	public double peso(){
		return this.peso;
	}

	public String sexo(){
		return this.sexo;
	}	
	
	public double calcularIndiceDeMasaCorporal(){
		return this.peso/(this.altura*this.altura);
	}

}