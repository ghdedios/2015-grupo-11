package dds.grupo11;

import java.time.LocalDate;

public class UsuarioMinimo {

	
	private String nombre;
	private double altura;
	private double peso;
	private LocalDate fechaNac;
	private int sexo;
	

	public UsuarioMinimo (double altura, double peso){
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
