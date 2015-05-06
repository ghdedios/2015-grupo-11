package dds.grupo11;


public class Ingrediente {

	private String nombre;
	private double cantidad;
	private String unidad;
	
	public Ingrediente(String nombre, double cant, String unidad) {
		this.nombre = nombre;
		this.cantidad =cant;
		this.unidad = unidad;
	}
	
	
	public Ingrediente (String nombre, double cantidad){
		this.nombre=nombre;
		this.cantidad=cantidad;
	}
	
	//Getters, no se si hacen falta. Cualquier cosa se borran
	public String nombre(){
		return this.nombre;
	}
	
	public String unidad(){
		return this.unidad;
	}
	
	public double cantidad(){
		return this.cantidad;
	}
	
	
}
