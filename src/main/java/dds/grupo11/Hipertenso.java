package dds.grupo11;

public class Hipertenso implements Condicion {
	
	public boolean cumpleCondicionPreexistente(Usuario usuario){
		return usuario.tieneAlgunaComidaPreferida();
	}

}