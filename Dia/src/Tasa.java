import java.util.Scanner;


public class Tasa {
	private Scanner teclado;
	private double valor;
	public double valor () {
		return valor;
	}
	public Tasa(){
	System.out.print("Ingrese origen de la prenda: \"nacional\" o \"importado\".\n");
	teclado = new Scanner(System.in);
	String origen;
	origen = teclado.nextLine();
	while (true){
		switch (origen) {
			case "nacional" : 
				valor = 1;
				break;
			case "importado" : 
				valor = 1.3;
				break;
			default:
				System.out.print("Tipo de origen incorrecto. Ingrese origen de la prenda: \"nacional\" o \"importado\".\n");
				origen = teclado.nextLine();
				continue;
				}
			break;
		}
	}
	public static void main(String[] args) {
	Tasa macowins;
	macowins = new Tasa();
	System.out.println(macowins.valor());
	}
}

