package Aula;
import java.util.Locale;
public class ExercicioDeFixação {
	
	public static void main(String[] args) {
		String produto1 = "Computador";
		String produto2 = "Disco Oficial";
		
		int idade = 30;
		int codigo = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
			System.out.println("Produtos: ");
			System.out.printf("%s, Qual preço é $ %.2f %n", produto1, price1);
			System.out.printf("%s, Qual preço é $ %.2f %n", produto2, price2);
			System.out.println("");
		
		System.out.printf("Recorde: %d Anos velho, codigo %d e genero: %s %n", idade, codigo, gender);
		System.out.println("");
		
			System.out.printf("Measue whit eight decimal places: $ %f", measure);
			System.out.printf("Rouded (three decimal places): %.3f %n", measure);
			Locale.setDefault(Locale.US);
			System.out.printf("US decimal point: %.3f", measure);
		
	}
	
}
