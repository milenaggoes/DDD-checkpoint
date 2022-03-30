package estrutura_de_decisão;

import java.util.Scanner;

public class ex08 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int p1, p2;
		
		System.out.printf("Digite o primeiro número: ");
		p1 = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		p2 = ler.nextInt();
		
		if (p1 > p2) { 
			System.out.printf("O número %d é o maior", p1);
		}
		else {
			System.out.printf("O número %d é o maior", p2);
			
		}
		ler.close(); 
	}
}
