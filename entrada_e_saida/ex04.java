package entrada_e_saida;

import java.util.Scanner;

public class ex04 {
	
	public static void main(String[] args) {
	
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, d, soma;
		
		System.out.printf("Digite o primeiro valor:");
		a = ler.nextInt();
		
		System.out.printf("Digite o segundo valor:");
		b = ler.nextInt();
		
		System.out.printf("Digite o terceiro valor:");
		c = ler.nextInt();
		
		System.out.printf("Digite o quarto valor:");
		d = ler.nextInt();
		
		soma = (a + b + c + d) /2;
		
		System.out.printf(" A media aritimetrica é: %d ", soma);
		ler.close();
	}
}
