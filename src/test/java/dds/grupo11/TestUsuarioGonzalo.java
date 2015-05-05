package dds.grupo11;

import static org.junit.Assert.assertEquals; 

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

//import static org.mockito.Mockito.*;

public class TestUsuarioGonzalo {

	private UsuarioMinimo usuarioGonzalo;
	
	
	@Before
	public void setUp(){
		
		usuarioGonzalo = new UsuarioMinimo("Gonzalo",1.65,67,LocalDate.of(1994,3,19),"Hombre");
		
	}
	
	@Test
	public void usuarioGonzaloCalculaIndiceDeMasaCorporalCorrectamente() throws Exception {
		
		assertEquals ( (double) 24.61, (double) usuarioGonzalo.calularIndiceDeMasaCorporal(),0.2);
		
	}
	
}