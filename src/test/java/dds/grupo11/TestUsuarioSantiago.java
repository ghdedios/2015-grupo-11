package dds.grupo11;

import static org.junit.Assert.assertEquals; 

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class TestUsuarioSantiago {


	private UsuarioMinimo usuarioSantiago;
	
	
	@Before
	public void setUp(){
		
		usuarioSantiago = new UsuarioMinimo("Santiago",1.79,74,LocalDate.of(1993,10,6),"Hombre");
		
	}
	
	@Test
	public void usuarioSantiagoCalculaIndiceDeMasaCorporalCorrectamente() throws Exception {
		
		assertEquals ( (double) 23.09, (double) usuarioSantiago.calcularImc(),0.2);
	}
}