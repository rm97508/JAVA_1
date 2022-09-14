package entrada_processamento_saida;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		/* 5. Entrar via teclado com o valor de uma temperatura em graus Celsius, 
		 * calcular e exibir sua temperatura equivalente em Fahrenheit.
		 */
				 double c,temp;	
				    
				    System.out.printf(" Digite o valor da temperatura em Celsius: ");
				    c = ler.nextDouble();
				    
				    
				   temp = (c*9/5)+32;
				    
				    System.out.printf("O valor da temperatura em Fahrenheit é: %.1f°F ", temp); 
	}

}
