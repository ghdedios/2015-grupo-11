package dds.grupo11;

public abstract class Prenda {
	private int valorFijoNegocio;
	private Marca marca;
	private boolean esImportada;
	
	public abstract double  precioBase();
	
	public double tasaImportacion(){
		if(this.esImportada == true){
			return 1.3;
		}else{
			return 1.0;
		}
	}
	
	public double precioFinal(){
		return (this.valorFijoNegocio + this.precioBase()) 
				* this.tasaImportacion() * this.marca.coeficienteDeMarca(this);
 	}
	

}
