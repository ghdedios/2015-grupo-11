package dds.grupo11;

public class Usuario {
	private double altura;
	private double peso;
	
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
