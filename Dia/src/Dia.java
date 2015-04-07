import java.util.*;

public class Dia {
	private Scanner teclado;
	private ArrayList<Venta> Ventas;
	private Local local;
	
public Dia () {
	local = new Local();
	Ventas = new ArrayList<Venta>();
	teclado = new Scanner(System.in);
	System.out.println("Presione Enter para ingresar venta o presione 'q' para terminar:");
	while (!teclado.nextLine().equals("q")){
		Venta unaVenta = new Venta();
		Ventas.add(unaVenta);
    	System.out.println("Presione Enter para ingresar venta o presione 'q' para terminar:");
	}
}

public double ganancia(){
	double acum = 0;
	for (Venta unaVenta : Ventas){
		acum += unaVenta.precioVenta(local.valorNegocio());
		
	}
	return acum;
}

	public static void main(String[] args) {
		Dia unDia;
		unDia = new Dia();
		System.out.print(unDia.ganancia());
	}

}
