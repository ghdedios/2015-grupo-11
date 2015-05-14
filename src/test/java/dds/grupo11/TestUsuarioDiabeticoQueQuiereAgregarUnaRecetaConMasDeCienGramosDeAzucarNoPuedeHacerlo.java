package dds.grupo11;

import static org.junit.Assert.*;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class TestUsuarioDiabeticoQueQuiereAgregarUnaRecetaConMasDeCienGramosDeAzucarNoPuedeHacerlo {
	
	private Diabetico diabetico = new Diabetico();
	private Usuario usuario;
	private Receta recetaParaAgregar;
	private Ingrediente condimentoAzucar; 
	private Ingrediente condimentoOregano; 
	
	@Before
	public void setUp(){
		usuario = new Usuario("Nombre de prueba",1.80,75,LocalDate.of(2000,1,1),null);
		usuario.setearCondicion(diabetico);
		recetaParaAgregar = new Receta(false,"con mucha azucar",EnumDificultadReceta.MEDIA,"algo",EnumTemporadaReceta.OTONIO);
		condimentoAzucar = new Ingrediente("Azucar",200);
		condimentoOregano = new Ingrediente("Oregano",500);
		recetaParaAgregar.agregarCondimento(condimentoAzucar);
		recetaParaAgregar.agregarCondimento(condimentoOregano);
		usuario.agregarReceta(recetaParaAgregar);
	}
	
	@Test
	public void usuarioDiabeticoNoPuedeAgregarRecetaConMuchaAzucar() throws Exception{
		assertTrue(usuario.getRecetas().size()==0);
	}
	
}
