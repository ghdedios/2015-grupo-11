package dds.grupo11;

public class Diabetico implements Condicion {
	
	@Override
	public boolean cumpleCondicionPreexistente(Usuario usuario){
		return (usuario.tieneAlgunaComidaPreferida() && usuario.indicaSexo());
	}

	
}
