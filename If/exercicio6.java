import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		double numero = in.nextDouble();
		
		if(numero == 0 || numero > 100.0) {
			System.out.println("Fora de intervalo!");
		}else if(numero < 0.0 || numero > 25.0) {
			System.out.println("Intervalo [0,25]");
		}else if(numero <= 50.0) {
			System.out.println("Intervalo [25,50]");
		}else if(numero <= 75.0) {
			System.out.println("Intervalo [50,75]");
		}else {
			System.out.println("Intervalo [74,100]");
		}
	}
}