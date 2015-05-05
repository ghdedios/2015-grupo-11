package dds.grupo11;

import static org.junit.Assert.*; 

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class TestUsuarioVeganoQueComeCarnesEsInvalido {
	
	private Usuario usuarioPollo, usuarioChivito, usuarioChori, usuarioCarne;
	private Vegano condicion = new Vegano();
	
	@Before
	public void setUp(){
		usuarioPollo = new Usuario("Nombre de Prueba Pollo", 1.80,75,LocalDate.of(2000,1,1),"Hombre");
		usuarioPollo.setearCondicion(condicion);
		usuarioPollo.setearComidaPreferida("pollo");
		
		usuarioChivito = new Usuario("Nombre de Prueba Chivito", 1.80,75,LocalDate.of(2000,1,1),"Hombre");
		usuarioChivito.setearCondicion(condicion);
		usuarioChivito.setearComidaPreferida("chivito");
		
		usuarioChori = new Usuario("Nombre de Prueba Chori", 1.80,75,LocalDate.of(2000,1,1),"Hombre");
		usuarioChori.setearCondicion(condicion);
		usuarioChori.setearComidaPreferida("chori");
		
		usuarioCarne = new Usuario("Nombre de Prueba Carne", 1.80,75,LocalDate.of(2000,1,1),"Hombre");
		usuarioCarne.setearCondicion(condicion);
		usuarioCarne.setearComidaPreferida("carne");
	}
	
	@Test
	public void usuarioHipertensoSinComidasPreferidasEsInvalido() throws Exception{
		assertFalse(usuarioPollo.usuarioValido());
		assertFalse(usuarioChivito.usuarioValido());
		assertFalse(usuarioCarne.usuarioValido());
		assertFalse(usuarioChori.usuarioValido());
	}
}