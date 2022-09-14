package entrada_processamento_saida;

import java.util.Scanner;

public class Ex01_java {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		/* 1. Entrar via teclado com a base e a altura de um retângulo, 
		 * calcular e exibir sua área.*/
		
	    double b,a,area;	
	    
	    System.out.printf("Digite o valor da base do retângulo: ");
	    b = ler.nextDouble();
	    
	    System.out.printf("Digite o valor da altura do retângulo: ");
	    a = ler.nextDouble();
	       
	    area = b*a;
	    
	    System.out.printf("O valor da area do retângulo é: %.1f ",area); 
	    
	}

}
