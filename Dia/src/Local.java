import java.util.*;

public class Local {
	private Scanner teclado;
	public int valorNegocio;
	public int valorNegocio () {
		return valorNegocio;
	};
	public Local () {
		System.out.print("Ïngrese valor agregado del negocio:\n");
		teclado = new Scanner(System.in);
			valorNegocio = teclado.nextInt();
		}
//	COMO NO TENEMOS IDEA DE COMO HACER UN TEST, HICIMOS ESTO
//		public static void main(String[] args) {
//		Local macowins;
//		macowins = new Local();
//		System.out.println(macowins.valorNegocio());
//	}
}
