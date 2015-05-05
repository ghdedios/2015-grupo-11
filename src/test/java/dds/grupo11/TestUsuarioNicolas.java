package dds.grupo11;

import static org.junit.Assert.assertEquals; 

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class TestUsuarioNicolas {
	
	private UsuarioMinimo nicolas;
	
	@Before
	public void setUp(){
		
		nicolas = new UsuarioMinimo("Nicolas",1.83,77,LocalDate.of(1995,1,12),"Hombre");
	}
	
	@Test
	public void usuarioNicolasCalculaIndiceDeMasaCorporalCorrectamente() throws Exception {
		
		assertEquals((double)22.99,(double)nicolas.calcularIndiceDeMasaCorporal(),0.1);
	}
}