package entrada_e_saida;

import java.util.Scanner;

public class ex06 {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		
		double cotacao, dolares, reais;
		
		System.out.printf("Digite o valor da cota��o do d�lar:");
		cotacao = ler.nextDouble();
		
		System.out.printf("Digite a quantidade de d�lares:");
		dolares = ler.nextDouble();
		
		reais = cotacao * dolares;
				
		System.out.printf("O valor em reais � %.2f:", reais);
		
		ler.close();
	}
}
