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

	public String getNombre(){
		return this.nombre;
	}
	
	public String getUnidad(){
		return this.unidad;
	}
	
	public double getCantidad(){
		return this.cantidad;
	}
	
	
}
