package entrada_processamento_saida;

import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in)) {
			/*Entrar com o peso, o sexo e a altura de uma determinada pessoa. 
			 * Após a digitação, exibir se esta pessoa está ou não com seu peso ideal. Fórmula: peso/altura².*/
			double peso, alt, imc;
			String sexo;
			
			System.out.printf("Digite seu peso (massa): ");
			peso = ler.nextDouble();
			
			System.out.printf("Digite sua altura: ");
			alt = ler.nextDouble();
			
			System.out.printf("Digite seu sexo, F para Femino ou M para Masculino: ");
			sexo = ler.next();
			
			imc = peso/(alt*alt);
		if (sexo.toUpperCase().equals("M")) {
			if (imc < 20 ) {
			System.out.printf("Seu imc é %.2f e você está abaixo do peso ideal!",imc);
			}else if (imc>=25) {
			System.out.printf("Seu imc é %.2f e você está acima do peso ideal! ",imc);
			}else {
			System.out.printf("Seu imc é %.2f e você está no peso ideal! ",imc);}
	    }else {
	    	if (imc < 19 ) {
				System.out.printf("Seu imc é %.2f e você está abaixo do peso ideal!",imc);
				}else if (imc>=24) {
				System.out.printf("Seu imc é %.2f e você está acima do peso ideal!",imc);
				}else {
				System.out.printf("Seu imc é %.2f e você está no peso ideal!",imc);}
	    }
	}

}
}

