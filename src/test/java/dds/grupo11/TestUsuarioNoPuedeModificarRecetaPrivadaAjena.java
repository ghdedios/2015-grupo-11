package dds.grupo11;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*; 

public class TestUsuarioNoPuedeModificarRecetaPrivadaAjena {

	private Usuario usuarioDue�o;
	private Usuario usuarioAjeno;
	private Receta recetaPrivada;
	
	@Before
	public void setUp(){
		usuarioDue�o = new Usuario("Usuario due�o de receta",1.80,75,LocalDate.of(1990,1,1),"Hombre");
		usuarioAjeno = new Usuario("Usuario ajeno a receta",1.80,75,LocalDate.of(1990,1,1),"Hombre");
		recetaPrivada = new Receta(true,"Receta privada","Dificil","Expliacion","Oto�o");
		
		usuarioDue�o.agregarRecetaPrivada(recetaPrivada);
	}
	
	@Test
	public void usuarioAjenoARecetaNoDebePoderModificarla() throws Exception{
		assertFalse("Usuario ajeno a la receta esta pudiendo modificarla",usuarioAjeno.verReceta(recetaPrivada));
		//Hay que cambiar verReceta por algun metodo que intente modificar la receta
	}
}