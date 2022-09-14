package entrada_processamento_saida;

import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		/*13. Entrar via teclado com três valores distintos. Exibir o maior deles.*/
		double a,b,c;
		
		System.out.printf("Digitar o primeiro valor: ");
		a = ler.nextDouble();
		
		System.out.printf("Digitar o segundo valor:");
		b = ler.nextDouble();
		
		System.out.printf("Digitar o terceiro valor:");
		c = ler.nextDouble();
		
		if (a==b && b==c) { 
		   System.out.printf("Números iguais!");    
		}else if (a==c && c>b) {
	       System.out.printf("O primeiro e o terceiro são iguais e maiores que o segundo");
		    
		}else if (a==b && b>c) {
		   System.out.printf("O primeiro e o segundo são iguais e maiores que o terceiro");
		    
		}else if (b==c && b>a) {
		   System.out.printf("O  segundo e o terceiro são iguais e maiores que o primeiro");			
		}else if (a<b && b>c) {
		   System.out.printf("O segundo valor é maior");
		} else if (c<a && a>b) {
		   System.out.printf("O primeiro valor é maior");
		}else {
		   System.out.printf("Terceiro é maior");
		    }
	}

}
