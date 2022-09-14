package entrada_processamento_saida;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
/*4. Calcular e exibir a média aritmética
 *  de quatro valores quaisquer que serão digitados.
 */
		 double a,b,c,d,media;	
		    
		    System.out.printf(" Digite o valor do primeiro item: ");
		    a = ler.nextDouble();
		    
		    System.out.printf(" Digite o valor do segundo item: ");
		    b = ler.nextDouble();
		    
		    System.out.printf(" Digite o valor do terceiro item: ");
		    c = ler.nextDouble();
		    
		    System.out.printf(" Digite o valor do quarto item: ");
		    d = ler.nextDouble();
		    
		    media = (b+a+c+d)/4;
		    
		    System.out.printf("O valor da média é: %.1f ",media); 
	}

}
