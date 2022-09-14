package entrada_processamento_saida;

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		/* 6. Entrar via teclado com o valor da cotação do dólar e uma 
		 * certa quantidade de dólares. Calcular e exibir o valor 
		 * correspondente em Reais (R$).
		 */
	    double d,c,r;
	    
	    System.out.printf("Digite o valor da cotação do dia:  ");
	    c = ler.nextDouble();
	    
	    System.out.printf("Digite o valor do dollar:  ");
	    d = ler.nextDouble();
	    
	    r = c*d;
	    
	    System.out.printf("O valor do dollar em real é: R$%.2f ",r); 
	    
	}

}
