package entrada_processamento_saida;

import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		/*16. Verificar se três valores quaisquer (A, B, C) que serão digitados formam ou não um triângulo 
		 * retângulo. Lembre-se que o quadrado da hipotenusa é igual a soma dos quadrados dos catetos.*/
		double a, b,c, tr, h2;
		
		System.out.printf("Digite o  valor da hipotenusa: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o valor do primeiro cateto: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o valor do segundo cateto: ");
		c = ler.nextDouble();
		
		tr = (b*b) + (c*c);
		h2 = (a*a);
		
		if (h2 == tr) {
			System.out.printf("Os valores indicados formam um triângulo retângulo!");
		}else {
			System.out.printf("Os valores indicados NÃO formam um triângulo retângulo!");
		}
		
	}

}
