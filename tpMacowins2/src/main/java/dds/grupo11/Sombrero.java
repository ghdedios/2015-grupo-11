package dds.grupo11;

public class Sombrero extends Prenda {
	
	private double coeficienteMetro;
	 

	public Sombrero (double coefMetro){
		this.coeficienteMetro = coefMetro;
	}
	
	public double precioBase(){
		return (150 + 1 * this.coeficienteMetro);
	}

}
