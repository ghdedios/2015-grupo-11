package dds.grupo11;

import static org.junit.Assert.assertEquals; 

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

//import static org.mockito.Mockito.*;

public class TestUsuarioGonzalo {

	private UsuarioMinimo usuarioGonzalo;
	
	
	@Before
	public void setUp(){
		
		usuarioGonzalo = new UsuarioMinimo("Gonzalo",1.65,67,LocalDate.of(1994,3,19),"Hombre");
		
	}
	
	@Test
	public void usuarioGonzaloCalculaIndiceDeMasaCorporalCorrectamente() throws Exception {
		
<<<<<<< HEAD
		assertEquals ( (double) 24.61, (double) usuarioGonzalo.calcularIndiceDeMasaCorporal(),0.2);
=======
		assertEquals ( (double) 24.61, (double) usuarioGonzalo.calularIndiceDeMasaCorporal(),0.1);
>>>>>>> 801a69616a365db9cb57cc8939e2549b295872e6
		
	}
	
}