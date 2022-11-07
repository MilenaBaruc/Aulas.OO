package questionario1;

import java.util.Scanner;

public class questao4 {
	
	public static void main(String[] args) {
		
		int num, sum = 0;
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Digite um numero positivo para ser somado ou negativo para sair:");
			num = entrada.nextInt();
			if(num > 0) {
				sum += num;
			}
		} while(num >= 0);
		
		System.out.println("A soma é: " + sum);
	}
}
