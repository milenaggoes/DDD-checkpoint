package entrada_e_saida;

import java.util.Scanner;

public class ex06 {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		
		double cotacao, dolares, reais;
		
		System.out.printf("Digite o valor da cotação do dólar:");
		cotacao = ler.nextDouble();
		
		System.out.printf("Digite a quantidade de dólares:");
		dolares = ler.nextDouble();
		
		reais = cotacao * dolares;
				
		System.out.printf("O valor em reais é %.2f:", reais);
		
		ler.close();
	}
}
