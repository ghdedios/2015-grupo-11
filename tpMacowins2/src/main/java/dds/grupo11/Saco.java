package dds.grupo11;

public class Saco extends Prenda {
	
	private double cantBotones;
	

	public Saco (double botones){
		this.cantBotones = botones;
	}
	
	public double precioBase(){
		return (300 + 10 * this.cantBotones);
	}
}