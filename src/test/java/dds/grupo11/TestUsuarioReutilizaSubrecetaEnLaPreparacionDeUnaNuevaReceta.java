package dds.grupo11;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class TestUsuarioReutilizaSubrecetaEnLaPreparacionDeUnaNuevaReceta {
	
	private Usuario usuario;
	private Receta subrecetaReutilizable;
	private Receta recetaNueva;
	private String explicacionDeLaSubreceta;
	
	@Before
	public void setUp(){
		
		usuario = new Usuario("Usuario duenio de receta",1.80,75,LocalDate.of(1990,1,1),"Hombre");
		recetaNueva = new Receta(true,"milanesas con pure",EnumDificultadReceta.BAJA,"Empanar y freir milanesas.Luego..",EnumTemporadaReceta.TODO_EL_ANIO);
		subrecetaReutilizable = new Receta(true,"pure",EnumDificultadReceta.BAJA,"hervir,pisar,condimentar",EnumTemporadaReceta.TODO_EL_ANIO);
		usuario.agregarReceta(recetaNueva);
		recetaNueva.agregarSubreceta(subrecetaReutilizable);
		explicacionDeLaSubreceta = recetaNueva.getSubrecetas().stream().findFirst().get().getExplicacion();
	}
	
	@Test
	public void UsuarioReutilizaSubrecetaParaPrepararUnaRecetaNueva() throws Exception{
		assertTrue(usuario.getRecetas().stream().findFirst().get().getExplicacion()
		.concat(explicacionDeLaSubreceta).equals("Empanar y freir milanesas.Luego..hervir,pisar,condimentar"));
	}
	
}
