package entrada_e_saida;

import java.util.Scanner;

public class ex03 {
	
	public static void main(String[] args) {
		
Scanner ler = new Scanner (System.in);
		
		int b, h, resultado;
		
		System.out.printf("Digite o valor da base do triangulo: ");
		b = ler.nextInt();
		
		System.out.printf("Digite o valor da altura do triangulo: ");
		h = ler.nextInt();
		
		resultado = b * h /2; 
		
		System.out.printf("A area do retangulo é: %d", resultado);
		ler.close();
	}

}
