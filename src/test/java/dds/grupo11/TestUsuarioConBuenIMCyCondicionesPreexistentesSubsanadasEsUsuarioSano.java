package dds.grupo11;

import static org.junit.Assert.*; 

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class TestUsuarioConBuenIMCyCondicionesPreexistentesSubsanadasEsUsuarioSano {
	
	private Usuario usuario;
	private Hipertenso hipertenso;
	private Diabetico diabetico;
	private Vegano vegano;
	private Celiaco celiaco;
	
	
	@Before
	public void setUp(){
		usuario = new Usuario("Nombre de Prueba", 1.80,70,LocalDate.of(2000,1,1),"Hombre");
		usuario.agregarCondicion(hipertenso);
		usuario.agregarCondicion(diabetico);
		usuario.agregarCondicion(vegano);
		usuario.agregarCondicion(celiaco);
		usuario.agregarRutina("Fuerte");
		usuario.agregarComidaPreferida("Fruta");
		
		
	}
	
	@Test
	public void usuarioHipertensoSinComidasPreferidasEsInvalido() throws Exception{
		assertTrue(usuario.calularIndiceDeMasaCorporal() > 18);
		assertTrue(usuario.calularIndiceDeMasaCorporal() < 30);
		assertTrue(usuario.esSaludable());
	}
}