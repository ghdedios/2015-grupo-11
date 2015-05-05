package dds.grupo11;

import static org.junit.Assert.*; 

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class TestUsuarioVeganoQueComeCarnesEsInvalido {
	
	private Usuario usuarioPollo, usuarioChivito, usuarioChori, usuarioCarne;
	private Vegano condicion;
	
	@Before
	public void setUp(){
		usuarioPollo = new Usuario("Nombre de Prueba Pollo", 1.80,75,LocalDate.of(2000,1,1),"Hombre");
		usuarioPollo.agregarCondicion(condicion);
		usuarioPollo.agregarComidaPreferida("Pollo");
		
		usuarioChivito = new Usuario("Nombre de Prueba Chivito", 1.80,75,LocalDate.of(2000,1,1),"Hombre");
		usuarioChivito.agregarCondicion(condicion);
		usuarioChivito.agregarComidaPreferida("Chivito");
		
		usuarioChori = new Usuario("Nombre de Prueba Chori", 1.80,75,LocalDate.of(2000,1,1),"Hombre");
		usuarioChori.agregarCondicion(condicion);
		usuarioChori.agregarComidaPreferida("Chori");
		
		usuarioCarne = new Usuario("Nombre de Prueba Carne", 1.80,75,LocalDate.of(2000,1,1),"Hombre");
		usuarioCarne.agregarCondicion(condicion);
		usuarioCarne.agregarComidaPreferida("Carne");
	}
	
	@Test
	public void usuarioHipertensoSinComidasPreferidasEsInvalido() throws Exception{
		assertFalse(usuarioPollo.usuarioValido());
		assertFalse(usuarioChivito.usuarioValido());
		assertFalse(usuarioCarne.usuarioValido());
		assertFalse(usuarioChori.usuarioValido());
	}
}