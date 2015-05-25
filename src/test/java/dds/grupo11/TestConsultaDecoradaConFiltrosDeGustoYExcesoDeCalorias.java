package dds.grupo11;

import static org.junit.Assert.assertTrue;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

public class TestConsultaDecoradaConFiltrosDeGustoYExcesoDeCalorias {

	private Usuario usuario;
	private Collection<Receta> recetasFiltradas = new HashSet<Receta>();
	private Receta recetaNueva1;
	private Receta recetaNueva2;
	private Receta recetaNueva3;
	private Ingrediente ingrediente;
	private MockRepositorio mockedRepo;
	private Consulta consultaSinDecorar = new ConsultaSinFiltros(mockedRepo);
		
	@Before
	public void setUp(){
		this.mockedRepo = mock(MockRepositorio.class);	
		usuario = new Usuario("Usuario duenio de receta",1.80,75,LocalDate.of(1990,1,1),"Hombre");
		
		recetaNueva1 = new Receta(true,"milanesas con pure",EnumDificultadReceta.BAJA,"Empanar y freir milanesas.Luego..",EnumTemporadaReceta.TODO_EL_ANIO);
		recetaNueva1.setTotalCalorias(750);
		this.mockedRepo.agregar(recetaNueva1);
				
		recetaNueva2 = new Receta(true,"tortilla de papa",EnumDificultadReceta.MEDIA,"Cortar y freir papas.Luego..",EnumTemporadaReceta.VERANO);
				
		recetaNueva3 = new Receta(true,"fideos",EnumDificultadReceta.BAJA,"Hervir el agua y poner fideos.Luego..",EnumTemporadaReceta.TODO_EL_ANIO);
		ingrediente = new Ingrediente("fideos",0.5,"kilos");
		recetaNueva3.agregarIngrediente(ingrediente);
		usuario.setearComidaQueLeDisgusta(ingrediente);
		mockedRepo.agregar(recetaNueva2);
		mockedRepo.agregar(recetaNueva3);
		
		recetasFiltradas.add(recetaNueva2);
		
		consultaSinDecorar = new FiltroGustoUsuario(new FiltroExcesoCalorias(15,consultaSinDecorar));
		
		
	}
	
	@Test
	public void UsuarioRealizaConsultaDecorada() throws Exception{
		assertTrue(consultaSinDecorar.consultarRecetas(this.usuario).containsAll(recetasFiltradas));
	}
	
	
	
}
