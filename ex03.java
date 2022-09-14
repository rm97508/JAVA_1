package entrada_processamento_saida;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		/* 3. A partir dos valores da base e altura de
		 *  um triângulo, calcular e exibir sua área. */
		 double a,b,area;	
		    
		    System.out.printf("Digite o valor da altura do triagulo: ");
		    a = ler.nextDouble();
		    
		    System.out.printf("Digite o valor da base do triagulo: ");
		    b = ler.nextDouble();
		    
		    area = (b*a)/2;
		    
		    System.out.printf("O valor da area do triagulo é: %.1f ",area); 
	}

}
