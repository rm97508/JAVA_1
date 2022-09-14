package entrada_processamento_saida;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		
		/* 10. Entrar com dois valores quaisquer. Exibir o maior deles, se existir,
		 *  caso contrário, enviar mensagem avisando que os números são idênticos.
		 */
		double v1,v2;
		
		System.out.println("Digite o primeiro valor: ");
		v1 = ler.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		v2 = ler.nextDouble();
		
		if (v1>v2) {
			System.out.printf("O primeiro valor é o maior: %.1f",v1);
		}else if (v1==v2) {
			System.out.printf("Os valores %.1f e %.1f são iguais!", v1, v2);
		}else {
			System.out.printf("O segundo valor é maior: %.1f",v2);
		}
		
	}

}
