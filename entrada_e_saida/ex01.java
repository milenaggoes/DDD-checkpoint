package entrada_e_saida;

import java.util.Scanner;

public class ex01 {
	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int b, h, resultado;
		
		System.out.printf("Digite o valor da base do retangulo: ");
		b = ler.nextInt();
		
		System.out.printf("Digite o valor da altura do retangulo: ");
		h = ler.nextInt();
		
		resultado = b * h; 
		
		System.out.printf("A area do retangulo é: %d", resultado);
		ler.close();
	}
}
