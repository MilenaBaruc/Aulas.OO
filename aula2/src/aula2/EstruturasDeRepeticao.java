package aula2;

import java.util.Scanner;

public class EstruturasDeRepeticao{
	
	public static void main(String[] args){
		
		int vetInt[] = new int[10];
		Scanner entrada = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++){
			System.out.println("Digite um numero inteiro: ");
			vetInt[i] = entrada.nextInt();
		}
		
		entrada.close();
		
		for(int i = 0; i < 10; i++){
			System.out.print(vetInt[i] + " ");
		}
		
		/* while(condicao){
		 * Comandos que devem ser executados
		 * }
		 * 
		 * do{
		 * Comando que devem ser executados
		 * }
		 * while(condicao);
		 */
	}
}
