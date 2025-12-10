package Aula;
import java.util.Scanner;

public class A42_Multiples {
	public static void main(System[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num_1;
		int num_2;
		
		System.out.println("O progama le dois valores inteiros e indica se são multiplos ou não (devem ser digitados em ordem decrescente)"
				+ "Insira o primeiro valor: ");
		num_1 = sc.nextInt();
		System.out.println("Insira o segundo valor: ");
		num_2 = sc.nextInt();
		
		if (num_1 % 2 == 0) {
			System.out.println("É Multiplo!");
		}else {
			System.out.println("Não é Multiplo");
		}
	}
}
