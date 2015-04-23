package dds.grupo11;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import static org.mockito.Mockito.*;

public class PrendaTest {
		
	private Camisa camisaNacional;
	private Marca marca; 
	
	@Before
	public void setUp() {
		marca  = mock(Marca.class);
		
		camisaNacional = new Camisa(false, marca);
	}
	
	@Test
	public void precioFinalDeUnaCamisaDaValorCorrecto() throws Exception {
		when(marca.coeficienteDeMarca(anyDouble()) ).thenReturn(1.0);
		
		assertEquals( (Double) 250.0, camisaNacional.precioFinal());
		
		verify(marca, times(1)).coeficienteDeMarca(anyDouble());
	}
}