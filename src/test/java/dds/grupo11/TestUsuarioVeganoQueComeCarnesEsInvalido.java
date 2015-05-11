package dds.grupo11;

import static org.junit.Assert.*; 

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

public class TestUsuarioVeganoQueComeCarnesEsInvalido {
	
	private Usuario usuario;
	private Vegano condicion = new Vegano();
	private Ingrediente pollo;
	private Ingrediente chivito;
	private Ingrediente chori;
	private Ingrediente carne;
	
	@Before
	public void setUp(){
		usuario = new Usuario("Nombre de Prueba Vegano", 1.80,75,LocalDate.of(2000,1,1),"Hombre");
		usuario.setearCondicion(condicion);
		pollo = new Ingrediente("pollo",1,"kilo");
		chivito = new Ingrediente("chivito",2,"kilos");
		chori = new Ingrediente("chori",0.5,"kilos");
		carne = new Ingrediente("carne",1,"kilo");
		usuario.setearComidaPreferida(pollo);
		usuario.setearComidaPreferida(chivito);
		usuario.setearComidaPreferida(chori);
		usuario.setearComidaPreferida(carne);
	}
	
	@Test
	public void usuarioVeganoTienePolloComoComidaPreferidaNoEsValido() throws Exception{
		assertFalse(usuario.usuarioValido());
	}
	@Test
	public void usuarioVeganoTieneChivitoComoComidaPreferidaNoEsValido() throws Exception{
		assertFalse(usuario.usuarioValido());
	}
	@Test
	public void usuarioVeganoTieneChoriComoComidaPreferidaNoEsValido() throws Exception{
		assertFalse(usuario.usuarioValido());
	}
	@Test
	public void usuarioVeganoTieneCarneComoComidaPreferidaNoEsValido() throws Exception{
		assertFalse(usuario.usuarioValido());
	}
}