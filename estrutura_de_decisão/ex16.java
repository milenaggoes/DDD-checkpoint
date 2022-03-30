package estrutura_de_decisão;

import java.util.Scanner;

public class ex16 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int h, c1, c2;

		System.out.printf("Digite o valor da hipotenusa:");
		h = ler.nextInt();

		System.out.printf("Digite o valor do primeiro cateto:");
		c1 = ler.nextInt();

		System.out.printf("Digite o valor do segundo cateto:");
		c2 = ler.nextInt();

		h = h * h;
		c1 = c1 * c1;
		c2 = c2 * c2;

		if (h == c1 + c2) {
			System.out.printf("É um triângulo retângulo.");

		} else {
			System.out.printf("Não forma um triângulo retângulo.");

		}
		ler.close();
	}
}