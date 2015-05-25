package dds.grupo11;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.* ;

public class TestUsuarioAgregaRecetaAFavorito {
	
	private Usuario usuario;
	private Receta receta;
	
	@Before
	public void setUp(){
		usuario = new Usuario("Nombre de Prueba", 1.80,80,LocalDate.of(2000,1,1),"Hombre");
		receta = new Receta(false,"Receta de prueba",EnumDificultadReceta.ALTA,"Explicacion de prueba",EnumTemporadaReceta.OTONIO);
		usuario.agregarAFavoritos(receta);
	}

	@Test
	public void usuarioAgregaARecetaFavoritosCorrectamente() throws Exception{
		assertTrue(usuario.getFavoritos().contains(receta));
	}
	
}
