package estrutura_de_decisão;

import java.util.Scanner;

public class ex12 {
	public static void main(String[] args)  {
		Scanner ler = new Scanner(System.in);
	
		int b, h, resultado;
		
		System.out.printf("Digite a altura do retângulo:");
		b = ler.nextInt();
		
		System.out.printf("Digite a largura do retângulo:");
		h = ler.nextInt();
		
		resultado = b * h; 
		
		if (resultado > 100) {
		System.out.printf("Terreno grande");
		
		}else {
			System.out.printf("Terreno pequeno");
		}
		ler.close();
	}
	
}	

