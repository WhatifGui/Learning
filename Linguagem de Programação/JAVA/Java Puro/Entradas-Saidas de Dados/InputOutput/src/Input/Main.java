package Input;

import java.util.Scanner;

// ENTRADA DE  DADOS //
public class Main {
	
	// MÉTODO PARA STARTAR A APLICAÇÃO //
	public static void main(String[] args) {
		// ABERTURA DA INSTANCIA DA CLASSE DE INPUT SC //
		Scanner sc = new Scanner(System.in);
		
		// SAIDA DE DADOS
		System.out.print("Digite um numero: ");
		// ENTRADA DO VALOR NA VARIÁVEL X
		int x = sc.nextInt();
		System.out.println("SEU NUMERO: " + x);
		
		
		// FECHAMENTO DA CLASSE SC
		sc.close();
	}
}
