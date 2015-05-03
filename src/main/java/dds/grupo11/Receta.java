package dds.grupo11;

import java.util.*;

public class Receta {

	private boolean esPrivada;
	private Collection <Receta> subreceta = new HashSet();
	private Collection <Ingrediente> ingredientes = new HashSet();
	private Collection <Ingrediente> condimentos = new HashSet();
	
}
