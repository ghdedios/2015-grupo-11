import java.util.*;

public class Venta {
	private Scanner teclado;
	private Local local;
	private Prenda prenda;
	private double cantidad;
	
	public Venta(){
		local = new Local();
		prenda = new Prenda();
		teclado = new Scanner(System.in);
		System.out.print("Ingrese cantidad vendida:\n");
		cantidad = teclado.nextDouble();
		
	}
	
	public double precioPrenda(){
		return ( (local.valorNegocio() + prenda.Precio() ) * prenda.Tasa() );
	}
	
	public double precioVenta(){
		return (precioPrenda() * cantidad);
	}
	
//	public static void main(String[] args){
//		Venta unaVenta;
//		unaVenta = new Venta();
//		System.out.println(unaVenta.precioPrenda());
//		System.out.println(unaVenta.precioVenta());
//	}
}
