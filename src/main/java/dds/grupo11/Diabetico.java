package dds.grupo11;

public class Diabetico implements Condicion {
	
	public boolean cumpleValidez(Usuario usuario){
		if(usuario.tienePreferencia() && usuario.tieneSexo()) {
			return true;
		} else {
			return false;
		}
	}
}
