package dds.grupo11;

import static org.junit.Assert.*; 

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class TestUsuarioDiabeticoSinSexoInvalido {
	
	private Usuario usuario;
	private Diabetico condicion = new Diabetico();
	
	@Before
	public void setUp(){
		usuario = new Usuario("Nombre de Prueba", 1.80,75,LocalDate.of(2000,1,1),null);
		usuario.setearCondicion(condicion);
	}
	
	@Test
	public void usuarioDiabeticoSinSexoEsUsuarioInvalido() throws Exception{
		assertFalse(usuario.usuarioValido());
	}
}
