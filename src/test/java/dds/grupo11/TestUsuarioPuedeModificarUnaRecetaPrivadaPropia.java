package dds.grupo11;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*; 

public class TestUsuarioPuedeModificarUnaRecetaPrivadaPropia {

	private Usuario usuarioDueño;
	private Receta recetaPrivada;

	
	@Before
	public void setUp(){
		usuarioDueño = new Usuario("Usuario duenio de receta",1.80,75,LocalDate.of(1990,1,1),"Hombre");
		recetaPrivada = new Receta(true,"Receta privada","Dificil","Explicacion","Otonio");
		usuarioDueño.agregarReceta(recetaPrivada);
		usuarioDueño.agregarRecetaModificada(recetaPrivada, "Receta privada nueva","" , "Explicacion nueva","");
	}
	
	@Test
	public void usuarioDueñoDeRecetaDebePoderModificarla() throws Exception{
		assertTrue(usuarioDueño.getRecetas().stream().filter(receta -> receta.getNombre()=="Receta privada nueva").findFirst().get().getNombre().equalsIgnoreCase("Receta privada nueva"));
		assertTrue(usuarioDueño.getRecetas().stream().filter(receta -> receta.getNombre()=="Receta privada nueva").findFirst().get().getExplicacion().equalsIgnoreCase("Explicacion nueva"));
		assertTrue(usuarioDueño.getRecetas().stream().filter(receta -> receta.getNombre()=="Receta privada nueva").findFirst().get().getDificultad().equalsIgnoreCase("Dificil"));
		assertTrue(usuarioDueño.getRecetas().stream().filter(receta -> receta.getNombre()=="Receta privada nueva").findFirst().get().getTemporada().equalsIgnoreCase("Otonio"));
	}
}
