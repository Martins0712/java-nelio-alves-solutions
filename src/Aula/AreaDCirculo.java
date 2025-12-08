package Aula;

public class AreaDCirculo {
	public static void main(String[] args) {
		double Pi = 3.14159;
		double Raio = 2.00;
		System.out.printf("A area é igual a %.4f %n", Pi* Math.pow(Raio, 2));
		
		double Raio1 = 100.64;
		System.out.printf("A area é igual a %.4f %n", Pi*Math.pow(Raio1, 2) );
		
		double Raio2 = 150.00;
		System.out.printf("A area é igual a %.4f %n", Pi*Math.pow(Raio2, 2) );

	}
}
