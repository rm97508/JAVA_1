package entrada_processamento_saida;

import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		/*8. Entrar via teclado, com dois valores distintos. 
		 * Exibir o maior deles.
		 */
	   
	        double v1, v2;
	       
	        System.out.printf("Digite o primeiro valor: ");
	        v1 = ler.nextDouble();
	       
	        System.out.printf("Digite o segundo valor: ");
	        v2 = ler.nextDouble();
	       
	        if (v1>v2) {
	            System.out.printf("O maior valor corresponde ao primeiro valor que é: %.1f.", v1);
	        }else {
	            System.out.printf("O maior valor corresponde ao segundo valor que é: %.1f.", v2);
	        }
	}
}


