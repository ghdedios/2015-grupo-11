package dds.grupo11;

public class Pantalon extends Prenda{
	
	private double cantCm;
	
	public double precioBase(){
		return (250 + 1 * this.cantCm);
	}

}
