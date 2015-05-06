package dds.grupo11;

import static org.junit.Assert.*; 

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class TestUsuarioDiabeticoYGordoConRutinaIntensivaEsSaludable {
	
	private Usuario usuario;
	private Diabetico condicion = new Diabetico();
	
	@Before
	public void setUp(){
		usuario = new Usuario("Nombre de Prueba", 2.0,120,LocalDate.of(2000,1,1),"Hombre");
		usuario.setearCondicion(condicion);
		usuario.setearRutina("INTENSIVO");
	}
	
	@Test
	public void usuarioEsDiabeticoYGordoConRutinaIntensivaEsSaludable () throws Exception {
		assertEquals(30,usuario.calcularImc(),0);
		assertTrue(usuario.sigueRutinaSaludable());
	}
	
}
