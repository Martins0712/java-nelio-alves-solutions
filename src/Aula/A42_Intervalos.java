package Aula;
import java.util.Locale;
import java.util.Scanner;

public class A42_Intervalos {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		
		System.out.print("Este progama le valores inseridos e apresenta uma mensagem dizendo em qual dos seguintes intervalos o usuario esta sendo eles ([0,25], (25,50], (50,75], (75,100])\r\n"
				+ "Insira o Valor: ");
		double Intervalos = sc.nextDouble();
		
		if (Intervalos < 0 || Intervalos > 100.0) {
			System.out.println("Fora de Intervalo");
		}else if (Intervalos <= 25.0) {
			System.out.println("Intervalo (0,25)");
		}else if (Intervalos <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}else if (Intervalos <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}else {
			System.out.println("Fora de Intervalo");
		}
	}
}
