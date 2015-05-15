package dds.grupo11;

import static org.junit.Assert.assertFalse;


import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class TestUnaRecetaNoPuedeSerSugeridaAUsuario {
	
	private Usuario usuario;
	private Receta receta;
	
	@Before
	public void setUp(){
		usuario = new Usuario("Usuario de prueba",1.80,75,LocalDate.of(1990,1,1),"Hombre");
		receta =  new Receta(false,"Receta de prueba",EnumDificultadReceta.MEDIA,"Explicacion",EnumTemporadaReceta.OTONIO);
		receta.agregarIngrediente(new Ingrediente("papa",2,"kg"));
		usuario.setearComidaQueLeDisgusta(new Ingrediente("Papa",1));
	}
	
	@Test
	public void sugerirRecetaSinIngredientesQueDisgustenAlUsuario() throws Exception{
		assertFalse(usuario.sugerir(receta));
	}

}
