package dds.grupo11;

import static org.junit.Assert.* ;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;

import org.mockito.*;
import org.junit.Before;
import org.junit.Test;

public class TestUsuarioRealizaConsultaSinFiltros {
	
	private Usuario usuario;
	private Collection<Receta> recetasVisibles = new HashSet<Receta>();
	private Collection<Receta> recetasFiltradas = new HashSet<Receta>();
	private Receta recetaNueva1;
	private Receta recetaNueva2;
	private Receta recetaNueva3;
	private Ingrediente ingrediente;
		
	@Before
	public void setUp(){
		usuario = new Usuario("Usuario duenio de receta",1.80,75,LocalDate.of(1990,1,1),"Hombre");
		recetaNueva1 = new Receta(true,"milanesas con pure",EnumDificultadReceta.BAJA,"Empanar y freir milanesas.Luego..",EnumTemporadaReceta.TODO_EL_ANIO);
		recetaNueva1.setTotalCalorias(750);
		usuario.agregarReceta(recetaNueva1);

		recetaNueva2 = new Receta(true,"tortilla de papa",EnumDificultadReceta.MEDIA,"Cortar y freir papas.Luego..",EnumTemporadaReceta.VERANO);
		usuario.agregarReceta(recetaNueva2);
		
		recetaNueva3 = new Receta(true,"fideos",EnumDificultadReceta.BAJA,"Hervir el agua y poner fideos.Luego..",EnumTemporadaReceta.TODO_EL_ANIO);
		ingrediente = new Ingrediente("fideos",0.5,"kilos");
		recetaNueva3.agregarIngrediente(ingrediente);
		usuario.setearComidaQueLeDisgusta(ingrediente);
		usuario.agregarReceta(recetaNueva3);
		
		recetasVisibles.add(recetaNueva2);
		recetasFiltradas = usuario.consultarRecetasVisibles();
		
		Consulta consultaSinDecorar = new ConsultaSinFiltros();
		consultaSinDecorar = new FiltroGustoUsuario(new FiltroExcesoCalorias(15,consultaSinDecorar));
	}
	
	@Test
	public void UsuarioRealizaConsultaDecorada() throws Exception{
		assert(recetasVisibles.containsAll(recetasFiltradas));
	}
	
	
	
	
}
