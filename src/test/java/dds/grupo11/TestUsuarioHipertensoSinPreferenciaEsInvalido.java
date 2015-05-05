package dds.grupo11;

import static org.junit.Assert.*; 

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class TestUsuarioHipertensoSinPreferenciaEsInvalido {
	
	private Usuario usuario;
	private Hipertenso condicion;
	
	@Before
	public void setUp(){
		usuario = new Usuario("Nombre de Prueba", 1.80,75,LocalDate.of(2000,1,1),"Hombre");
		usuario.agregarCondicion(condicion);
	}
	
	@Test
	public void usuarioHipertensoSinComidasPreferidasEsInvalido() throws Exception{
		assertFalse(usuario.usuarioValido());
	}
}