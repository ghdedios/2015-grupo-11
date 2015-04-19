package dds.grupo11;
import java.util.*;

public class Venta {
	public Venta (Prenda prenda, int cantidad){
		this.fecha = new Date();
		this.prenda = prenda;
		this.cantidad = cantidad;
	}
	
	private Date fecha;
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

	public Date fecha() {
		return this.fecha;
	}
}