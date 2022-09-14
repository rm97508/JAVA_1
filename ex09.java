package entrada_processamento_saida;

import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler =new Scanner (System.in);
		
		double v1, v2;
	       
        System.out.printf("Digite o primeiro valor: ");
        v1 = ler.nextDouble();
       
        System.out.printf("Digite o segundo valor: ");
        v2 = ler.nextDouble();
       
        if (v1<v2) {
            System.out.printf("O menor valor corresponde ao primeiro valor que é: %.1f.", v1);
            }else if (v1==v2) {
            	System.out.printf("Valores iguais!");
        	
        } else {
            System.out.printf("O menor valor corresponde ao segundo valor que é: %.1f.", v2);
        }

	}

}
