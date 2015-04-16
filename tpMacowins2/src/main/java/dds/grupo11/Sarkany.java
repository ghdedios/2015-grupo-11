package dds.grupo11;

public class Sarkany implements Marca {
	
	public double coeficienteDeMarca(Prenda prenda){
		if(prenda.precioBase()>500){
			return 1.35;
		}else{
			return 1.1;
		}
			
		}
		
	}
	



