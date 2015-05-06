package dds.grupo11;

public class Diabetico implements Condicion {
	
	public boolean cumpleCondicionPreexistente(Usuario usuario){
		return (usuario.tieneAlgunaComidaPreferida() && usuario.getSexo() != null);
	}

	public boolean cumpleCondicionDeRutinaSaludable(Usuario usuario){
		return (usuario.getPeso() < 70 || usuario.getRutina() == "INTENSIVO" || usuario.getRutina() == "FUERTE");
	}

	public boolean validarReceta(Receta unaReceta) {
		return unaReceta.cantidadDeAzucar()<100;
	}
}