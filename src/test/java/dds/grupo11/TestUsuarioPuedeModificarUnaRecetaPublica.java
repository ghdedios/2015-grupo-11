package dds.grupo11;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import dds.grupo11.Receta.Dificultad;
import dds.grupo11.Receta.Temporada;
import static org.junit.Assert.*; 

public class TestUsuarioPuedeModificarUnaRecetaPublica {

	private Usuario usuario;
	private Receta recetaPublica;

	
	@Before
	public void setUp(){
		usuario = new Usuario("Usuario duenio de receta",1.80,75,LocalDate.of(1990,1,1),"Hombre");
		recetaPublica = new Receta(false,"Receta publica",Dificultad.BAJA,"Explicacion",Temporada.OTONIO);
		usuario.agregarRecetaModificada(recetaPublica, "Receta publica nueva",Dificultad.BAJA,"Explicacion nueva",Temporada.OTONIO);
	}
	
	@Test
	public void usuarioPuedeModificarRecetaPublica() throws Exception{
		assertTrue(usuario.getRecetas().stream().findFirst().get().getNombre().equalsIgnoreCase("Receta publica nueva"));
		assertTrue(usuario.getRecetas().stream().findFirst().get().getExplicacion().equalsIgnoreCase("Explicacion nueva"));
		assertTrue(usuario.getRecetas().stream().findFirst().get().getDificultad().equals(Dificultad.BAJA));
		assertTrue(usuario.getRecetas().stream().findFirst().get().getTemporada().equals(Temporada.OTONIO));
	}
}
