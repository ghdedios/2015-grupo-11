package dds.grupo11;

import static org.junit.Assert.*; 

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class TestUsuarioConBuenIMCyCondicionesPreexistentesSubsanadasEsUsuarioSano {
	
	private Usuario usuario;
	private Hipertenso hipertenso = new Hipertenso();
	private Diabetico diabetico = new Diabetico();
	private Vegano vegano = new Vegano();
	private Celiaco celiaco = new Celiaco();
	
	
	@Before
	public void setUp(){
		usuario = new Usuario("Nombre de Prueba", 1.80,80,LocalDate.of(2000,1,1),"Hombre");
		usuario.setearCondicion(hipertenso);
		usuario.setearCondicion(diabetico);
		usuario.setearCondicion(vegano);
		usuario.setearCondicion(celiaco);
		usuario.setearRutina("INTENSIVO");
		usuario.setearComidaPreferida("frutas");
	}
	
	@Test
	public void usuarioHipertensoSinComidasPreferidasEsInvalido() throws Exception{
		assertTrue(usuario.calcularImc() > 18);
		assertTrue(usuario.calcularImc() < 30);
		assertTrue(usuario.sigueRutinaSaludable());
	}
}