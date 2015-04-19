package dds.grupo11;

public class Pantalon extends Prenda{
	
	private double cantCm;
	
	public Pantalon (double cantCM){
		this.cantCm = cantCM;
	}
	
	public double precioBase(){
		return (250 + 1 * this.cantCm);
	}
	
	public void cantidadCentimemtros(double cantCm){
		this.cantCm = cantCm;
	}

}
