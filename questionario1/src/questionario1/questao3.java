package questionario1;

import java.util.Scanner;

public class questao3 {
	
	public static void main(String[] args) {
		int pnum, snum, result;
		char operacao;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Entre com a opera��o a ser realizada (+, - ou *):");
		operacao = entrada.nextLine().charAt(0); //nextLine: armazenar string; chatAt(quantidade de caractere).
		System.out.println("Entre com o primeiro n�mero:");
		pnum = entrada.nextInt();
		System.out.println("Entre com o segundo n�mero:");
		snum = entrada.nextInt();
		
		switch(operacao) {
		case '+':
			result = (pnum + snum);
		    System.out.println("O resultado da opera��o �: " + result);
		    break;
		case '-':
			result = (pnum - snum);
		    System.out.println("O resultado da opera��o �: " + result);
		    break;
		case '*':
			result = (pnum * snum);
		    System.out.println("O resultado da opera��o �: " + result);
		    break;
		default:
			System.out.println("Opera��o inv�lida");
		}
	}
}
