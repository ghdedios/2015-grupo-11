package dds.grupo11;

public abstract class Prenda {
	protected NegocioMacowins negocio;
	protected Marca marca;
	protected boolean esImportada;
	
	public abstract double  precioBase();
	
	public double tasaImportacion(){
		return this.esImportada == true ? 1.3 : 1.0;
	}
	
	public double precioFinal(){
		return (this.negocio.valorFijoDeNegocio()+ this.precioBase()) 
				* this.tasaImportacion() * this.marca.coeficienteDeMarca(this.precioBase());
 	}
	

}
