package Aula;
import java.util.Locale;
import java.util.Scanner;

public class A42_IncomeTax {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Le um valor com duas casas decimais, equivalente ao salário de uma pessoa. Em seguida, calcula e\r\n"
				+ "mostra o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela do curso\r\n"
				+ "Insira o Valor Abaixo: ");
		
		double salarioo = sc.nextDouble();
		double imposto;
		if (salarioo <= 2000.00) {
			imposto = 0.0;
		}else if (salarioo <= 3000.00) {
			imposto = (salarioo - 2000.0) * 0.08;
		}else if (salarioo <= 4500.00) {
			imposto = (salarioo - 3000.0) * 0.18 + 1000 * 0.08;
		}else {
			imposto  =  (salarioo - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		}
		
		
		if (imposto == 0.0) {
			System.out.println("Isentoo");
		}
		else {
			System.out.printf("R$ %.2f%n", imposto);
		}
		
		sc.close();
	}
}
