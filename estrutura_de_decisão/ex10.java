package estrutura_de_decis�o;

import java.util.Scanner;

public class ex10 {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		
		int v1, v2;
		
		System.out.printf("Digite o primeiro valor: ");
		v1 = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		v2 = ler.nextInt();
		
		if (v1 > v2) {
			System.out.printf("O n�mero %d � o maior", v1);
			
		}else if (v1 < v2) {
			System.out.printf("O n�mero %d � o maior", v2);
		}
		else {
			System.out.printf("Os n�meros s�o id�nticos.");
		}
		ler.close();
	}
}
