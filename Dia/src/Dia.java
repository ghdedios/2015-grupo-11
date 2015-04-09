import java.util.*;

public class Dia {
	private Scanner teclado;
	
    class Nodo {
        Venta info;
        Nodo sig;
    }

    private Nodo raiz;
    
    public void insertarNodo(Venta unaVenta){
    	 Nodo punteroParaLista;
    	 punteroParaLista = new Nodo();
    	 punteroParaLista.info=unaVenta;
    	 punteroParaLista.sig=null;
    	 if (raiz==null){
    		 raiz = punteroParaLista;
    	 } else {
    		Nodo punteroRecorrer = raiz.sig;
    		while (punteroRecorrer != null){
    			punteroRecorrer= punteroRecorrer.sig;
    		}
    		punteroRecorrer = punteroParaLista;
    	 }
    }
    
    public Dia () {
    	teclado = new Scanner(System.in);
    	System.out.println("Presione Enter para ingresar venta o presione 'q' para terminar:");
    	while (!teclado.nextLine().equals("q")){
    		Venta unaVenta;
    		unaVenta = new Venta();
    		insertarNodo(unaVenta);
        	System.out.println("Presione Enter para ingresar venta o presione 'q' para terminar:");
    	}
    }
    
    public double ganancia(){
    	double acum=0;
    	Nodo punteroRecorre=raiz;
    	if(punteroRecorre==null){
    		return 0;
    	}else{
    		do{
    			acum = acum + punteroRecorre.info.precioVenta();
    			punteroRecorre= punteroRecorre.sig;
    		} while (punteroRecorre!=null);
    	}
    	return acum;
    	
    }
    
	public static void main(String[] args) {
		Dia unDia;
		unDia = new Dia();
		System.out.print(unDia.ganancia());
	}

}
