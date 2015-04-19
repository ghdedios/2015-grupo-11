package dds.grupo11;
import java.time.*;


public class Venta {
	public Venta (Prenda prenda, int cantidad){
		this.fecha = LocalDate.now();
		this.prenda = prenda;
		this.cantidad = cantidad;
	}
	
	private LocalDate fecha;
	private Prenda prenda;
	private int cantidad;
	
	public double importeTotal(){
		return (this.cantidad * this.prenda.precioFinal());
	}
	
	public void prenda(Prenda unaPrenda){
		this.prenda = unaPrenda;
	}
	
	public void cantidad(int unaCantidad){
		this.cantidad = unaCantidad;
	}

	public LocalDate fecha() {
		return this.fecha;
	}
}