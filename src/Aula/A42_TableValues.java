package Aula;
import java.util.Scanner;

public class A42_TableValues {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Lê o código de um item e a quantidade deste item. A\r\n"
				+ "seguir, calcula e mostra o valor da conta a pagar com base na tabela.\r\n"
				+ "Insira os Valores: ");
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		
		double total = 0;
		if (codigo == 1) {
			total = quantidade * 4.00;
		}else if (codigo == 2){
			total = quantidade * 4.50;
		}else if (codigo == 3) {
			total = quantidade * 5.00;
		}else if (codigo == 4) {
			total = quantidade * 2.0;
		}else if (codigo == 5) {
			total = quantidade * 1.5;
		}
		
		System.out.printf("Total: R$ %.2f%n", total);
		
		sc.close();
	}
}
