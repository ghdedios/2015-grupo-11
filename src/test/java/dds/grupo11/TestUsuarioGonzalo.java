package dds.grupo11;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

//import static org.mockito.Mockito.*;

public class TestUsuarioGonzalo {

	private Usuario usuario;
	
	
	@Before
	public void setUp(){
		
		double altura= (double) 1.65;
		double peso= 67;
		usuario = new Usuario(altura,peso);
		
	}
	
	@Test
	public void usuarioCalculaIndiceDeMasaCorporalCorrectamente() throws Exception {
		
		assertEquals ( (double) 24.61, (double) usuario.calularIndiceDeMasaCorporal(),0.2);
		
	}
	
}