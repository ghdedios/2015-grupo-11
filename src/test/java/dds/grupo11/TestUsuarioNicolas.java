package dds.grupo11;

import static org.junit.Assert.assertEquals;  

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class TestUsuarioNicolas {
	
	private DatosMinimosUsuario nicolas;
	
	@Before
	public void setUp(){
		
		nicolas = new DatosMinimosUsuario("Nicolas",1.83,77,LocalDate.of(1995,1,12),"Hombre");
	}
	
	@Test
	public void usuarioNicolasCalculaIndiceDeMasaCorporalCorrectamente() throws Exception {
		
		assertEquals((double)22.99,(double)nicolas.calcularImc(),0.1);
	}
}