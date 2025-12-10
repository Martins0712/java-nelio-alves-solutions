package Aula;
import java.util.Scanner;
public class A42_Par_Or_Impar {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Insira um valor Inteiro para descobrir se é par ou impar: ");
		num = sc.nextInt();
		
		if (num %2 == 0) {
			System.out.println("É Par!");
		}else {
			System.out.println("É Impar!");
		}
	}
}
