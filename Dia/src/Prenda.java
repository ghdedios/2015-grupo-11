import java.util.*;


public class Prenda {
	private Scanner teclado;
	private int precio;
	private Tasa tasa;
	public double Tipo (){
		return tasa.valor();
	}
	public double Tasa(){
		return tasa.valor();
	}
	public int Precio () {
		return precio;
	}
	public Prenda () {
		System.out.print("Ingrese tipo de prenda: \"saco\", \"pantalon\" o \"camisa\".\n");
		teclado = new Scanner(System.in);
		String tipoDePrenda;
		tipoDePrenda = teclado.nextLine();
		while (true){
			switch (tipoDePrenda) {
				case "saco" : 
					precio = 300;
					break;
				case "pantalon" : 
					precio = 250;
					break;
				case "camisa" : 
					precio = 200;
					break;
				default:
					System.out.print("Tipo de prenda incorrecto. Ingrese tipo de prenda: \"saco\", \"pantalon\" o \"camisa\".\n");
					tipoDePrenda = teclado.nextLine();
					continue;
			}
			break;
			
		}
		tasa = new Tasa();
	}
//	public static void main(String[] args) {
//		Prenda macowins;
//		macowins = new Prenda();
//		System.out.println(macowins.Precio());
//	}
}