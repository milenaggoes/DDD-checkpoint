package estrutura_de_decisão;

import java.util.Scanner;

public class ex17 {
	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		double alt, peso, imc;
		String genero;

		System.out.printf("Digite seu gênero:");
		genero = ler.nextLine();

		System.out.printf("Digite a sua altura:");
		alt = ler.nextDouble();

		System.out.printf("Digite o seu peso:");
		peso = ler.nextDouble();

		imc = peso / (alt * alt);

		if (genero == "masculino") {
			if (imc < 20) {
				System.out.printf("Abaixo do peso");

			} else if (imc < 25) {
				System.out.printf("Peso ideal");
			} else {
				System.out.printf("Acima do peso");
				ler.close();
			}

		} else {
			if (imc < 19) {
				System.out.printf("Abaixo do peso");

			} else if (imc < 24) {
				System.out.printf("Peso ideal");
			} else {
				System.out.printf("Acima do peso");
				ler.close();
			}

		}
	}
}
