package dds.grupo11;

public class Zapato extends Prenda {
	
	private double talle;
	
	public double precioBase(){
		return (400 + 5 * this.talle);
	}

}