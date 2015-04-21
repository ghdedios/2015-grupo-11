package dds.grupo11.mock;

import dds.grupo11.Marca;

public class MarcaMock implements Marca{
	
	Double coeficiente;
	
	public MarcaMock(Double coeficiente){
		this.coeficiente = coeficiente;
	}

	@Override
	public double coeficienteDeMarca(double precio) {
		// TODO Auto-generated method stub
		return 0;
	}

}
