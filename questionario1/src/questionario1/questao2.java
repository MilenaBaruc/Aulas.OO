package questionario1;

import java.util.Scanner;

public class questao2 {
	
	public static void main(String[] args) {
		int dia, mes, ano;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o dia:\n");
		dia = ler.nextInt();
		System.out.print("Digite o mes:\n");
		mes = ler.nextInt();
		System.out.print("Digite o ano:\n");
		ano = ler.nextInt();
		
		int resto = (ano % 4);
		
		if(mes >= 1 && mes <= 12){
			if(mes == 2){
				if(resto == 0) { //ano bissexto
					if(dia <= 29) {
						System.out.println("Data Válida. A data digitada foi: " + dia + "/" + mes + "/" + ano);
					}
					else {
						System.out.println("Data Inválida");
					}
				}
				else {
					if(dia <= 28) {
						System.out.println("Data Válida. A data digitada foi: " + dia + "/" + mes + "/" + ano);
					}
					else {
						System.out.println("Data Inválida");
					}
				}
			}
	    }
    }
}
