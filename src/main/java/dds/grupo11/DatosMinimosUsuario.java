package dds.grupo11;

import java.time.LocalDate;

public class DatosMinimosUsuario {
	
	protected String nombre;
	protected double altura=0;
	protected double peso=0;
	protected LocalDate fechaNac;
	protected String sexo;
	

	public DatosMinimosUsuario (String nombre, double altura, double peso,LocalDate fechaNac, String sexo){
		this.nombre = nombre;
		this.altura = altura;
		this.peso = peso;
		this.fechaNac = fechaNac;
		this.sexo = sexo;
	}
	
	public boolean usuarioTieneCamposObligatorios(){
		return (this.nombre != null) && (this.peso > 0) && (this.altura>0) && (this.sexo != null) && (this.fechaNac != null);
		
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
	
	public double calcularImc(){
		return this.peso/(this.altura*this.altura);
	}

}