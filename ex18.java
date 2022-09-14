package entrada_processamento_saida;

import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		/*18. Criar um programa para analisar a velocidade de um automóvel. 
		 * Solicitar via teclado os valores da aceleração (a em m/s2), velocidade inicial (v0 em m/s) e o 
		 * tempo de percurso (t em s). Calcular e exibir a velocidade final do automóvel em km/h. 
		 * E exibir mensagem de acordo com a tabela abaixo: Fórmula da velocidade em m/s: V = v0 + a. t
		 * */
		double a, b, c, vf, co;
		
		System.out.printf("Digite o valor da aceleração(m/s²): ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o valor do tempo(s):  ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o valor da velocidade(m/s): ");
		c = ler.nextDouble();
		
		vf = c+a*b;
		co = vf*(3.6);
		
		if ( co <= 40 ) { 
		    System.out.printf("Veículo está a %.2f, muito lento!",co);
		}else if ( 40 < co && co <= 60) {
		    System.out.printf("Veículo está a %.2f, velocidade permitida!",co);
		}else if (60 < co && co <= 80) { 
			 System.out.printf("Veículo está a %.2f, velocidade de cruzeiro!", co);
	    }else if (80 < co && co <= 120){ 
	    	 System.out.printf("Veículo está a %.2f, veículo está rápido!",co);
		}else { 
			 System.out.printf("Veículo está a %.2f, muito rápido!",co);}
		

	}

}
