package Aula;
import java.util.Scanner;
public class A42_Int_Nega_Posi {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Insira um numero inteiro e ira descobrir se é positivo ou negativo: ");
		num = sc.nextInt();
		
		if (num < 0) {
			System.out.println("Negativo!");
		}else {
			System.out.println("Positivo!");
		}
		
		sc.close();
	}
}
