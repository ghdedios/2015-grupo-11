package dds.grupo11;

import java.util.*;

public class Receta {
	
	//ATRIBUTOS
	private String nombrePlato;
	private Collection<Ingrediente> ingredientes = new HashSet();
	private Collection<Condimento> condimentos = new HashSet();
	private Collection<Receta> subRecetas = new HashSet();
	private String Explicacion;
	private boolean tipo;// 1 si es publica, 0 si es privada
	
	//METODOS
	
	public Receta(boolean tipo){
		this.tipo = tipo;
		
	}
	
	public boolean esPublica(){
		return tipo;
	}
	

}
