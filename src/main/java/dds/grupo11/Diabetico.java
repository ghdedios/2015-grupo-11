package dds.grupo11;

import dds.grupo11.Usuario.Rutina;



public class Diabetico implements Condicion {
	
	public boolean cumpleCondicionPreexistente(Usuario usuario){
		return (usuario.tieneAlgunaComidaPreferida() && usuario.getSexo() != null);
	}

	public boolean cumpleCondicionDeRutinaSaludable(Usuario usuario){
		return (usuario.getPeso() < 70 || usuario.getRutina().equals(Rutina.INTENSIVO) || usuario.getRutina().equals(Rutina.FUERTE));
	}

	public boolean validarReceta(Receta unaReceta) {
		return unaReceta.cantidadDeAzucar()<100;
	}
}