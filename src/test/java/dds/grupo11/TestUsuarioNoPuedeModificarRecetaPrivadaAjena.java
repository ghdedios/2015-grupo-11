package dds.grupo11;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*; 

public class TestUsuarioNoPuedeModificarRecetaPrivadaAjena {

	private Usuario usuarioDuenio;
	private Usuario usuarioAjeno;
	private Receta recetaPrivada;
	
	@Before
	public void setUp(){
		usuarioDuenio = new Usuario("Usuario due�o de receta",1.80,75,LocalDate.of(1990,1,1),"Hombre");
		usuarioAjeno = new Usuario("Usuario ajeno a receta",1.80,75,LocalDate.of(1990,1,1),"Hombre");
		recetaPrivada = new Receta(true,"Receta privada","Dificil","Explicacion","Oto�o");
		usuarioDuenio.agregarReceta(recetaPrivada);
		usuarioAjeno.agregarRecetaModificada(recetaPrivada, "Receta privada nueva","" , "Explicacion nueva","");
	}
	
	@Test
	public void usuarioAjenoARecetaNoDebePoderModificarla() throws Exception{
		assertTrue(usuarioAjeno.getRecetas().isEmpty());
	}
}