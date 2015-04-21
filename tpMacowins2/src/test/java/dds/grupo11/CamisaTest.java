package dds.grupo11;

import static org.junit.Assert.*;

import org.junit.Test;

import dds.grupo11.mock.MarcaMock;

public class CamisaTest {
	
	@Test
	public void elPrecioFinalDeUnaCamisaImportadaEsElCorrecto(){
		MarcaMock marca = new MarcaMock(1.65);
		Camisa camisa = new Camisa(true, marca);
		Double precio = camisa.precioFinal();
		assertEquals((Double)536.25,precio);
	}
}
