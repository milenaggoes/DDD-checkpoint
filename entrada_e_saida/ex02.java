package entrada_e_saida;

import java.util.Scanner;

public class ex02 {
	
	public static void main(String[] args) { 
		
		Scanner ler = new Scanner(System.in);
		
		int a, soma;
		
		System.out.printf("Digite o valor da aresta do quadrado: ");
		a = ler.nextInt();

		soma = a * a;
		
		System.out.printf("A area do quadrado é: %d", soma);
		ler.close();
	}

}
