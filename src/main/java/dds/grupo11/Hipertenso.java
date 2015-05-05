package dds.grupo11;

public class Hipertenso implements Condicion {
	
	public boolean cumpleValidez(Usuario usuario){
		if(usuario.tienePreferencia()) {
			return true;
		} else {
			return false;
		}
	}
}
