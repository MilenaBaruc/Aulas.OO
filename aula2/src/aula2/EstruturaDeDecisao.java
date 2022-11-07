package aula2;

import java.util.Scanner;

public class EstruturaDeDecisao {
	
	public static void main(String[] args){
		
		int A, B;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		A = entrada.nextInt();
		System.out.println("Digite outro numero inteiro: ");
		B = entrada.nextInt();
		
		if(A > B){
			System.out.println(A + " e maior que " + B);
		}
		else {
			if(B > A) {
				System.out.println(B + " e maior que " + A);
			}
			else {
				System.out.println("Os numeros são iguais");
			}
		}
	}
}
