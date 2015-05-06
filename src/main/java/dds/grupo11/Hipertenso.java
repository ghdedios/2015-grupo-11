package dds.grupo11;

public class Hipertenso implements Condicion {
	
	public boolean cumpleCondicionPreexistente(Usuario usuario){
		return usuario.tieneAlgunaComidaPreferida();
	}

	
	public boolean cumpleCondicionDeRutinaSaludable(Usuario usuario) {
		return usuario.getRutina() == "INTENSIVO";
	}


	@Override
	public boolean validarReceta(Receta unaReceta) {
		// TODO Auto-generated method stub
		return false;
	} 

}
