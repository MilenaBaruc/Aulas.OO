package questionario1;

import java.util.Scanner;

public class questao5 {
	
	public static void main(String[] args) {
		int num, resto;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o numero:");
		num = entrada.nextInt();
		
		resto = (num % 2);
		
		if(resto == 0) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}
}
