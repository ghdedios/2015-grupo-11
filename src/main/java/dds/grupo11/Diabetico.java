package dds.grupo11;

public class Diabetico implements Condicion {
	
	public boolean cumpleCondicionPreexistente(Usuario usuario){
		return (usuario.tieneAlgunaComidaPreferida() && usuario.indicaSexo());
	}

	@Override
	public boolean cumpleCondicionDeRutinaSaludable(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

}
