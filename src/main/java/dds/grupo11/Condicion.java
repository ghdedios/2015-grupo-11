package dds.grupo11;

public interface Condicion {
	
	public abstract boolean cumpleCondicionPreexistente(Usuario usuario);
	public abstract boolean cumpleCondicionDeRutinaSaludable(Usuario usuario);
	public abstract boolean validarReceta(Receta unaReceta);
}
