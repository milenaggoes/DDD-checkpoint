package estrutura_de_decis�o;

import java.util.Scanner;

public class ex18 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		double aceleracao, velocidadeI, tempo, velocidadef;

		System.out.printf("Digite a acelera��o:");
		aceleracao = ler.nextDouble();

		System.out.printf("Digite a velocidade:");
		velocidadeI = ler.nextDouble();

		System.out.printf("Digite o tempo:");
		tempo = ler.nextDouble();
		
		velocidadef = velocidadeI + (aceleracao * tempo) * 3.6 ;

		if (velocidadef <= 40) {
			System.out.printf("Ve�culo muito lento");
		}else if (velocidadef <= 60) {
			System.out.printf("Velocidade permitida");
		}else if (velocidadef <= 80) {
			System.out.printf("Velocidade de cruzeiro");
		}else if (velocidadef <= 120) {
			System.out.printf("Ve�culo r�pido");
		}else { 
			System.out.printf("Ve�culo muito r�pido");
		}

		ler.close();
	}
}
