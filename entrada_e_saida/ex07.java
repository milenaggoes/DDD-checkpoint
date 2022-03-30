package entrada_e_saida;
import java.util.Scanner;
public class ex07 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p1, p2, p3, p4, p5, soma, pago, troco;
		
		System.out.printf("Digite o valor do primeiro produto:");
		p1 = ler.nextDouble();
		
		System.out.printf("Digite o valor do segundo produto:");
		p2 = ler.nextDouble();
		
		System.out.printf("Digite o valor do terceiro produto:");
		p3 = ler.nextDouble();
		
		System.out.printf("Digite o valor do quarto produto:");
		p4 = ler.nextDouble();
		
		System.out.printf("Digite o valor do quinto produto:");
		p5 = ler.nextDouble();
		
		soma = p1 + p2 + p3 + p4 + p5;
		
		System.out.printf("Digite o valor que foi pago:");
		pago = ler.nextDouble();
		
		troco = pago - soma;
		
		System.out.printf("O troco deve ser %.2f", troco);
		
		ler.close();
	}
}
