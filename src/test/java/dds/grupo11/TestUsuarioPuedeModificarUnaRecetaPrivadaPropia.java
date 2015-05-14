package dds.grupo11;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*; 

public class TestUsuarioPuedeModificarUnaRecetaPrivadaPropia {

	private Usuario usuarioDuenio;
	private Receta recetaPrivada;

	
	@Before
	public void setUp(){
		usuarioDuenio = new Usuario("Usuario duenio de receta",1.80,75,LocalDate.of(1990,1,1),"Hombre");
		recetaPrivada = new Receta(true,"Receta privada",EnumDificultadReceta.ALTA,"Explicacion",EnumTemporadaReceta.OTONIO);
		usuarioDuenio.agregarReceta(recetaPrivada);
		usuarioDuenio.agregarRecetaModificada(recetaPrivada, "Receta privada nueva",EnumDificultadReceta.ALTA,"Explicacion nueva",EnumTemporadaReceta.OTONIO);
	}
	
	@Test
	public void usuarioDuenioDeRecetaDebePoderModificarla() throws Exception{
		assertTrue(usuarioDuenio.getRecetas().stream().filter(receta -> receta.getNombre().equals("Receta privada nueva")).findFirst().get().getNombre().equalsIgnoreCase("Receta privada nueva"));
		assertTrue(usuarioDuenio.getRecetas().stream().filter(receta -> receta.getNombre().equals("Receta privada nueva")).findFirst().get().getExplicacion().equalsIgnoreCase("Explicacion nueva"));
		assertTrue(usuarioDuenio.getRecetas().stream().filter(receta -> receta.getNombre().equals("Receta privada nueva")).findFirst().get().getDificultad().equals(EnumDificultadReceta.ALTA));
		assertTrue(usuarioDuenio.getRecetas().stream().filter(receta -> receta.getNombre().equals("Receta privada nueva")).findFirst().get().getTemporada().equals(EnumTemporadaReceta.OTONIO));
	}
}
