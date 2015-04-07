import java.util.*;

public class Venta {
	private Scanner teclado;
	private Prenda prenda;
	private double cantidad;
	
	public Venta(){
		prenda = new Prenda();
		teclado = new Scanner(System.in);
		System.out.print("Ingrese cantidad vendida:\n");
		cantidad = teclado.nextDouble();
		
	}
	
	public double precioPrenda(double valorLocal){
		return ( (valorLocal + prenda.Precio() ) * prenda.Tipo() );
		
	}
	
	public double precioVenta(double precioLocal){
		return (precioPrenda(precioLocal) * cantidad);
	}
	
//	public static void main(String[] args){
//		Venta unaVenta;
//		unaVenta = new Venta();
//		System.out.println(unaVenta.precioPrenda());
//		System.out.println(unaVenta.precioVenta());
//	}
}
