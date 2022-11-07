package aula2;

import java.util.Scanner;

public class EstruturaSequencial {
	
	public static void main(String[] args) {
		
		double A, B, C;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a A altura:");
		A = entrada.nextDouble();
		System.out.println("Digite a B altura:");
		B = entrada.nextDouble();
		System.out.println("Digite a C altura:");
		C = entrada.nextDouble();
		
		System.out.println("Os numeros digitados foram: " + A + ", " + B + " e " + C);
	}
}
