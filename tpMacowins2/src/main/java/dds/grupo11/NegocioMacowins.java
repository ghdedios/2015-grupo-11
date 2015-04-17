package dds.grupo11;
import java.util.*;

public class NegocioMacowins {
	
	private Collection<Venta> ventas = new ArrayList<Venta>();
	private Date fecha;
	
	public void agregarVenta(Venta unaVenta){
		this.ventas.add(unaVenta);
	}
	
	public void realizarVenta(int cantidadVendida, Prenda prendaVendida){
		
		Venta ventaARealizar = new Venta();
		ventaARealizar.prenda(prendaVendida);
		ventaARealizar.cantidad(cantidadVendida);
		this.agregarVenta(ventaARealizar);
	}
	
	
	public double gananciaDelDia(){
		double ganancia;
		ganancia = ventas.stream().filter(venta->venta.fecha()==this.fecha).mapToDouble(venta->venta.importeTotal()).sum();
		return ganancia;
	}
}
