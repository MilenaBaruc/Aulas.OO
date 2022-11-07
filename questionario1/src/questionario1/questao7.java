package questionario1;

import java.util.Scanner;

public class questao7 {
	
	public static boolean dig(String a) {
		if(a.matches("[0-9]")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		String caracter;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o carcater a ser verificado:");
		caracter = entrada.next();
		
		System.out.println(dig(caracter));
	}
}
