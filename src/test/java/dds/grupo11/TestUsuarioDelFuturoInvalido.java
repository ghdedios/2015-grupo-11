package dds.grupo11;
import static org.junit.Assert.*; 

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class TestUsuarioDelFuturoInvalido {
	
	private Usuario usuario;
	
	@Before
	public void setUp(){
		
		usuario = new Usuario("Nombre de Prueba",1.80,75,LocalDate.of(2016, 1, 15), "Hombre");
				
	}
	
	@Test
	public void usuarioNacidoEnElFuturoNoEsValido() throws Exception {
		assertFalse(usuario.usuarioValido());
	}
	
}
