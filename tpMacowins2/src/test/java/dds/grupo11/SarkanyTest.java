package dds.grupo11;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SarkanyTest {
	
	private Sarkany sarkany;
	
	@Before
	public void setUp(){
		sarkany = new Sarkany();
	}
	
	
	@Test
	public void coeficienteDeMarcaSarkanyEsElCorrecto(){
//FIXTURE
		
		
//OPERACIONES		
		Double coeficiente = sarkany.coeficienteDeMarca(500);
		assertEquals (coeficiente,(Double)1.1);
	}
	
	

}
