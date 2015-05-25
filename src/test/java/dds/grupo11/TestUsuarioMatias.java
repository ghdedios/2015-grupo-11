package dds.grupo11;

import static org.junit.Assert.assertEquals; 

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class TestUsuarioMatias {
	private DatosMinimosUsuario matias;
	
	@Before
	public void setUp(){
		matias = new DatosMinimosUsuario("Matias",1.75,64,LocalDate.of(1994,11,07),"Hombre");
	}
	
	@Test
	public void usuarioMatiasCalculaIndiceDeMasaCorporalCorrectamente() throws Exception {
		assertEquals((double)20.89,(double)matias.calcularImc(),0.1);
	}
}