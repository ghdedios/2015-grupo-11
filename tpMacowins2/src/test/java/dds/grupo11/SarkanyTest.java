package dds.grupo11;

import static org.junit.Assert.*;
import org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;


public class SarkanyTest {
	
	private Sarkany sarkany;
	
	@Before
	public void setUp(){
		sarkany = new Sarkany();
	}
	
	
	@Test
	public void coeficienteDeMarcaSarkanyEs1_65(){
//FIXTURE
		
		
//OPERACIONES		
		//FORMA COMUN
		Double coeficiente = sarkany.coeficienteDeMarca(500);
		assertEquals (coeficiente,(Double)1.1);
		//UTILIZANDO EL PLUG-IN DE MOCKITO Y SU LENGUAJE
		assertEquals((Double)1.1,sarkany.coeficienteDeMarca(500) );
	}
	
	

}
