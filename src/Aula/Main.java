package Aula;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double x = 10.35784;
		System.out.println(x);
		System.out.println("Quebra de linha");
		System.out.printf("%.2f%n", x);
		System.out.printf("%.4f%n", x);
		
			System.out.println("-----------------------------------------");
			Locale.setDefault(Locale.US);
			System.out.println("Quebra de linha com ponto ao inves de virgula! ");
			System.out.printf("%.4f%n", x);
			System.out.println("Resultado = " + x + " Metros");
		
		System.out.println("-----------------------------------------");
		System.out.println("Concatenar varios bagulhos");
		System.out.printf("Resultado = %.2f metros%n", x);
		
			System.out.println("-----------------------------------------");
			String nome = "Maria";
			int idade = 31;
			double renda = 4000.0;
			System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}
