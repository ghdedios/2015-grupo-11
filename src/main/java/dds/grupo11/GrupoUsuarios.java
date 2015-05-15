package dds.grupo11;

import java.util.Collection;
import java.util.HashSet;

public class GrupoUsuarios {

	private Collection <Usuario> usuarios = new HashSet<Usuario>();
	private String nombre;
	private Collection <String> palabrasClave = new HashSet <String>();
	
	public GrupoUsuarios(String nombre, Collection<String> palabrasClave){
		this.nombre = nombre;
		this.palabrasClave = palabrasClave;
	}
	
	public void agregarUsuario(Usuario usuario){
		this.usuarios.add(usuario);
	}
	
}
