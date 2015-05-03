package dds.grupo11;

import static org.junit.Assert.assertEquals; 

import org.junit.Before;
import org.junit.Test;

//import static org.mockito.Mockito.*;

public class TestUsuarioGonzalo {

	private UsuarioValido usuarioGonzalo;
	
	
	@Before
	public void setUp(){
		
		usuarioGonzalo = new UsuarioValido(1.65,67);
		
	}
	
	@Test
	public void usuarioGonzaloCalculaIndiceDeMasaCorporalCorrectamente() throws Exception {
		
		assertEquals ( (double) 24.61, (double) usuarioGonzalo.calularIndiceDeMasaCorporal(),0.2);
		
	}
	
}