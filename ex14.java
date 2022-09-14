package entrada_processamento_saida;

import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		/* 14. Entrar com o peso e a altura de uma determinada pessoa. 
		 * Após a digitação, exibir se esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura².*/
		double peso, alt, imc;
		
		System.out.printf("Digite seu peso (massa): ");
		peso = ler.nextDouble();
		
		System.out.printf("Digite sua altura: ");
		alt = ler.nextDouble();
		
		imc = peso/(alt*alt);
		
		if (imc < 19 ) {
			System.out.printf("Seu imc é %.2f e você está abaixo do peso ideal!",imc);
		}else if (imc>=24) {
			System.out.printf("Seu imc é %.2f e você está acima do peso ideal!",imc);
		}else {
			System.out.printf("Seu imc é %.2f e você está no peso ideal!",imc);
		}
		
	}

}
