package estrutura_de_decisão;

import java.util.Scanner;

public class ex13 {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			int a,b,c;
			
			System.out.printf("Digite o primeiro número:");
			a = ler.nextInt();
			
			System.out.printf("Digite o segundo número:");
			b = ler.nextInt();
			
			System.out.printf("Digite o terceiro número:");
			c = ler.nextInt();
			
			if ((a > b) && (a > c))
				System.out.printf("A é o maior");
			else if ((b > a) && (b > c))
				System.out.printf("B é o maior");
			else
				System.out.printf("C é o maior");
		ler.close();				
	}
}
