package dds.grupo11;

public class Sarkany implements Marca {
	
	public double coeficienteDeMarca(double precio){
		return precio>500 ? 1.35 : 1.1;
		
	}
}
	



