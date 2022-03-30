package estrutura_de_decisão;

import java.util.Scanner;

public class ex15 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int l1, l2, l3;
		
		System.out.printf("Digite o valor do primeiro lado:");
		l1 = ler.nextInt();
		
		System.out.printf("Digite o valor do segundo lado:");
		l2 = ler.nextInt();
		
		System.out.printf("Digite o valor do terceiro lado:");
		l3 = ler.nextInt();
		
		if ((l1==l2) && (l2!=l3))
			System.out.printf("Este é um triângulo isósceles");
		else if ((l1 != l2) && (l2 != l3 ))
			System.out.printf("Este é um triângulo escaleno");
		else
			System.out.printf("Este é um triângulo equilatero");
		ler.close();
	}
}