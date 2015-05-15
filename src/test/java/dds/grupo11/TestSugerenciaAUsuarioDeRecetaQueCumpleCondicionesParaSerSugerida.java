package dds.grupo11;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*; 

public class TestSugerenciaAUsuarioDeRecetaQueCumpleCondicionesParaSerSugerida {

	private Usuario usuario;
	private Receta receta;
	
	@Before
	public void setUp(){
		usuario = new Usuario("Usuario de prueba",1.80,75,LocalDate.of(1990,1,1),"Hombre");
		receta =  new Receta(false,"Receta de prueba",EnumDificultadReceta.MEDIA,"Explicacion",EnumTemporadaReceta.OTONIO);
		receta.agregarIngrediente(new Ingrediente("Tabasco",2,"kg"));
		usuario.setearComidaQueLeDisgusta(new Ingrediente("Papa",1));
	}
	
	@Test
	public void sugerirRecetaSinIngredientesQueDisgustenAlUsuario() throws Exception{
		assertTrue(receta.puedeSerSugeridaAUnUsuario(usuario));
	}
}
