package dds.grupo11;

import java.time.LocalDate;

import static org.junit.Assert.*; 

import org.junit.Before;
import org.junit.Test;

public class TestUsuarioPuedeAgregarRecetaCorrectamente {
	
	private Usuario usuario;
	private Receta receta;
	
	@Before
	public void setUp(){
		usuario = new Usuario("Usuario de prueba",1.80,75,LocalDate.of(2000,1,1),"Hombre");
		receta = new Receta(false,"Receta de prueba",EnumDificultadReceta.ALTA,"Explicacion de prueba",EnumTemporadaReceta.OTONIO);
		usuario.agregarReceta(receta);

	}
	
	@Test
	public void usuarioPuedeAgregarReceta() throws Exception{
		assertSame(receta,usuario.getRecetas().stream().findFirst().get());
	}

}
