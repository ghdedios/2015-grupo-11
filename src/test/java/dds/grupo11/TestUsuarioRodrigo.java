package dds.grupo11;

import static org.junit.Assert.assertEquals; 

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class TestUsuarioRodrigo {
	private DatosMinimosUsuario rodrigo;
	
	@Before
	public void setUp(){
		rodrigo = new DatosMinimosUsuario("Rodrigo",1.81,82,LocalDate.of(1995,3,2),"Hombre");
	}
	
	@Test
	public void usuarioRodrigoCalculaIndiceDeMasaCorporalCorrectamente() throws Exception {
		assertEquals((double)25.029,(double)rodrigo.calcularImc(),0.1);
	}
}