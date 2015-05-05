package dds.grupo11;

public class Diabetico implements Condicion {
	
	public boolean cumpleCondicionPreexistente(Usuario usuario){
		return (usuario.tieneAlgunaComidaPreferida() && usuario.indicaSexo());
	}

<<<<<<< HEAD
	public boolean cumpleCondicionDeRutinaSaludable(Usuario usuario){
		return (usuario.subsanarDiabetes());
	}
=======
	@Override
	public boolean cumpleCondicionDeRutinaSaludable(Usuario usuario) {
		// TODO Auto-generated method stub
		return false;
	}

>>>>>>> 801a69616a365db9cb57cc8939e2549b295872e6
}
