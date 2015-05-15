package dds.grupo11;

import java.util.Collection;
import java.util.HashSet;

public class GrupoUsuarios {
	
	public GrupoUsuarios(String nombre, Collection<String> palabrasClave){
		this.nombre = nombre;
		this.palabrasClave = palabrasClave;
	}
	
	private Collection <Usuario> usuarios = new HashSet<Usuario>();
	private String nombre;
	private Collection <String> palabrasClave = new HashSet <String>();
	
	
	
	public void agregarUsuario(Usuario usuario){
		this.usuarios.add(usuario);
	}
	
	public boolean sugerir(Receta receta){
		return usuarios.stream().allMatch(usuario -> usuario.sugerir(receta));
	}
}
