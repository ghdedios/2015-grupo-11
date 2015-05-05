package dds.grupo11;

import static org.junit.Assert.assertEquals; 

import org.junit.Before;
import org.junit.Test;

public class TestUsuarioNicolas {
	
	private UsuarioValido nicolas;
	
	@Before
	public void setUp(){
		
		nicolas = new UsuarioValido(1.83,77);
	}
	
	@Test
	public void usuarioNicolasCalculaIndiceDeMasaCorporalCorrectamente() throws Exception {
		
		assertEquals((double)22.99,(double)nicolas.calularIndiceDeMasaCorporal(),0.1);
	}
}