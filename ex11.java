package entrada_processamento_saida;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		/* 11. Calcular e exibir a área de um retângulo, a partir dos valores da base e altura 
		 * que serão digitados.Se a área for maior que 100, exibir a mensagem “Terreno grande”. */
		
		double b, alt, area;
		
		System.out.println ("Digite o valor da base do retângulo: ");
		b = ler.nextDouble();
		
		System.out.println ("Digite o valor da altura do retângulo: ");
		alt = ler.nextDouble();
		
		area = b*alt;
		
		if (area > 100) {
			System.out.printf("A área do retângulo é %.2f, portanto, o terreno é grande!",area);
		}else {
			System.out.printf("A área do retângulo é %.2f.",area);
		}
	}

}
