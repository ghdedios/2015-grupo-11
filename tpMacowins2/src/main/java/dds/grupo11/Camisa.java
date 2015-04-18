package dds.grupo11;

public class Camisa extends Prenda {
	
	public double precioBase(){
		return 200; 
	}
	
	public Camisa(boolean origen, Marca marca){
		this.esImportada = origen;
		this.marca = marca;
	}

}
