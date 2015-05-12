package dds.grupo11;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import dds.grupo11.Receta.Dificultad;
import dds.grupo11.Receta.Temporada;
import static org.junit.Assert.*; 

public class TestUsuarioNoPuedeModificarRecetaPrivadaAjena {

	private Usuario usuarioDuenio;
	private Usuario usuarioAjeno;
	private Receta recetaPrivada;
	
	@Before
	public void setUp(){
		usuarioDuenio = new Usuario("Usuario due�o de receta",1.80,75,LocalDate.of(1990,1,1),"Hombre");
		usuarioAjeno = new Usuario("Usuario ajeno a receta",1.80,75,LocalDate.of(1990,1,1),"Hombre");
		recetaPrivada = new Receta(true,"Receta privada",Dificultad.MEDIA,"Explicacion",Temporada.OTONIO);
		usuarioDuenio.agregarReceta(recetaPrivada);
		usuarioAjeno.agregarRecetaModificada(recetaPrivada, "Receta privada nueva",null , "Explicacion nueva",null);
	}
	
	@Test
	public void usuarioAjenoARecetaNoDebePoderModificarla() throws Exception{
		assertTrue(usuarioAjeno.getRecetas().isEmpty());
	}
}