package dds.grupo11;


public class Ingrediente {

	private String nombre;
	private double cantidad;
	private String unidad;
	
	public Ingrediente(String nombre, double cant, String unidad) {
		this.nombre = nombre;
		if (cant==0 && unidad==null ){
			this.cantidad=0;
			this.unidad="C/N";
		}else{
			this.cantidad=cant;
			this.unidad = unidad;
		}
	}
	
	/*
	public Ingrediente (String nombre){
		this.nombre=nombre;
		this.cantidad=0;
		this.unidad="C/N";
	}
	*/
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
