package entrada_processamento_saida;

import java.util.Scanner;

public class ex02_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		/* 2. Calcular e exibir a área de um quadrado, 
		 * a partir do valor de sua aresta que será digitado.
		 */
		
	    double l,area;	
	    
	    System.out.printf("Digite o valor do lado do quadrado: ");
	    l = ler.nextDouble();
	    
	    area = l*l;
	    /* como colocar expoente em java?
	     */
	    System.out.printf("O valor da area do quadrado é: %.1f ",area); 
	    
	}

}
