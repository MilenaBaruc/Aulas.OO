package questionario1;

import java.util.Scanner;

public class questao6 {
	
	public static void main(String[] args) {
		int maior, num1, num2, num3, num4, num5;
		maior = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro numero:");
		num1 = entrada.nextInt();
		System.out.println("Entre com o segundo numero:");
		num2 = entrada.nextInt();
		System.out.println("Entre com o terceiro numero:");
		num3 = entrada.nextInt();
		System.out.println("Entre com o quarto numero:");
		num4 = entrada.nextInt();
		System.out.println("Entre com o quinto numero:");
		num5 = entrada.nextInt();
		
		if((num1 > num2) && (num1 > num3) && (num1 > num4) && (num1 > num5)) {
			maior = num1;
		}
		else if((num2 > num1) && (num2 > num3) && (num2 > num4) && (num2 > num5)) {
			maior = num2;
		}
		else if((num3 > num1) && (num3 > num2) && (num3 > num4) && (num3 > num5)) {
			maior = num3;
		}
		else if((num4 > num1) && (num4 > num2) && (num4 > num3) && (num4 > num5)) {
			maior = num4;
		}
		else if((num5 > num1) && (num5 > num2) && (num5 > num3) && (num5 > num4)) {
			maior = num5;
		}
		
		System.out.println(maior);
	}
}
