package Aula;
import java.util.Scanner;

public class A42_GameDuration {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int Hour1;
			int Hour2;
			
		System.out.println("Lê a hora inicial e a hora final de um jogo calculando a duração do jogo \r\n"
				+ "Insira os valores: ");
		Hour1 = sc.nextInt();
		Hour2 = sc.nextInt();
		
		int duracao;
		if (Hour1 < Hour2) {
			duracao = Hour1 - Hour2;
		}else {
			duracao = 24 - Hour1 + Hour2;
		}
		
		System.out.printf("O jogo durou %d Horas", duracao);
	}
}
