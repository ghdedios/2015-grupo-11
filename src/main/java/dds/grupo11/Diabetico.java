package dds.grupo11;

public class Diabetico implements Condicion {
	
	public boolean cumpleCondicionPreexistente(Usuario usuario){
		return (usuario.tieneAlgunaComidaPreferida() && usuario.indicaSexo());
	}

	public boolean cumpleCondicionDeRutinaSaludable(Usuario usuario){
		return (usuario.subsanarDiabetes());
	}
}
