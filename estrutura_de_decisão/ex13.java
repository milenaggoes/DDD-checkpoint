package estrutura_de_decis�o;

import java.util.Scanner;

public class ex13 {
		public static void main(String[] args) {
			Scanner ler = new Scanner(System.in);
			
			int a,b,c;
			
			System.out.printf("Digite o primeiro n�mero:");
			a = ler.nextInt();
			
			System.out.printf("Digite o segundo n�mero:");
			b = ler.nextInt();
			
			System.out.printf("Digite o terceiro n�mero:");
			c = ler.nextInt();
			
			if ((a > b) && (a > c))
				System.out.printf("A � o maior");
			else if ((b > a) && (b > c))
				System.out.printf("B � o maior");
			else
				System.out.printf("C � o maior");
		ler.close();				
	}
}
