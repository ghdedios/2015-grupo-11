package dds.grupo11;

import static org.junit.Assert.*; 

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import dds.grupo11.Usuario.Rutina;

public class TestUsuarioConBuenIMCyCondicionesPreexistentesSubsanadasEsUsuarioSano {
	
	private Usuario usuario;
	private Hipertenso hipertenso = new Hipertenso();
	private Diabetico diabetico = new Diabetico();
	private Vegano vegano = new Vegano();
	private Celiaco celiaco = new Celiaco();
	private Ingrediente frutas;
	private Rutina rutinaIntensiva = Rutina.INTENSIVO;
	
	@Before
	public void setUp(){
		usuario = new Usuario("Nombre de Prueba", 1.80,80,LocalDate.of(2000,1,1),"Hombre");
		usuario.setearCondicion(hipertenso);
		usuario.setearCondicion(diabetico);
		usuario.setearCondicion(vegano);
		usuario.setearCondicion(celiaco);
		usuario.setearRutina(rutinaIntensiva);
		frutas =new Ingrediente("frutas",1,"kg");
		usuario.setearComidaPreferida(frutas);
	}
	
	@Test
	public void usuarioConIMCValidoYCondicionesPreexistentesSubsanadasEsUsuarioSano() throws Exception{
		assertTrue(usuario.sigueRutinaSaludable());
	}
}