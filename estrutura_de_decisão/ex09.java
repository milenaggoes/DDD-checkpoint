package estrutura_de_decis�o;

import java.util.Scanner;

public class ex09 {

public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int p1, p2;
		
		System.out.printf("Digite o primeiro n�mero: ");
		p1 = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		p2 = ler.nextInt();
		
		if (p1 < p2) { 
			System.out.printf("O n�mero %d � o menor", p1);
		}
		else {
			System.out.printf("O n�mero %d � o menor", p2);
			
		}
		ler.close();
	}
}

