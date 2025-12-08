package Aula;

public class SalarioFuncionario {
	public static void main(String[] args) {
		System.out.println("Um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por\r\n"
				+ "hora e calcula o salário desse funcionário.");
		
		int Number = 25;
		int Hours = 100;
		double VHours = 5.50;
		System.out.printf("NUMBER = %d\r\n"
				+ "SALARY = U$ %.2f%n\r\n"
				+ "", Number, Hours*VHours);
		
		
		int Number1 = 1;
		int Hours1 = 200;
		double VHours1 = 20.50;
		System.out.printf("NUMBER = %d\r\n"
				+ "SALARY = U$ %.2f%n\r\n"
				+ "", Number1, Hours1*VHours1);
		
		int Number2 = 6;
		int Hours2 = 145;
		double VHours2 = 15.55;
		System.out.printf("NUMBER = %d\r\n"
				+ "SALARY = U$ %.2f%n\r\n"
				+ "", Number2, Hours2*VHours2);
	}
}
