package entrada_processamento_saida;

import java.util.Scanner;

public class ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		/*Elabore um algoritmo que calcule o que deve ser pago por um produto, considerando o preço normal de 
		 * etiqueta e a escolha da condição de pagamento. Utilize os códigos da tabela a seguir para ler 
		 * qual a  condição de pagamento escolhida e efetuar o cálculo adequado e exibir o valor a 
		 * ser pago no final. Código Condição de pagamento À vista em dinheiro ou cheque, recebe 10% de desconto
		 * À vista no cartão de crédito, recebe 15% de desconto
		 * Em duas vezes, preço normal de etiqueta sem juros
		 * Em quatro vezes, preço normal de etiqueta mais juros de 10%*/
		
        double v1, desc, r;
		
		System.out.printf("Digite o valor do produto: ");
		v1 = ler.nextDouble();
		
		System.out.print("Escolha a operação desejada: \r\n"
				+ "		 * 1 – À vista em dinheiro ou cheque, recebe 10% de desconto\r\n"
				+ "		 * 2 – À vista no cartão de crédito, recebe 15% de desconto\r\n"
				+ "		 * 3 – Em duas vezes, preço normal de etiqueta sem juros\r\n"
				+ "		 * 4 – Em quatro vezes, preço normal de etiqueta mais juros de 10%:  ");
		desc = ler.nextDouble();
		
	if (desc == 1 ) {
		r = (v1*0.9);
		System.out.printf("O valor a ser pago é: R$%.2f!", r);
			
	}else if (desc == 2) {
		r = (v1*0.85);
		System.out.printf("O valor a ser pago é: R$%.2f!", r);
		
	}else if (desc == 3) {
		r = (v1/2);
		System.out.printf("O valor a ser pago em 2x é: R$%.2f!", r);
		
	}else if (desc == 4) {
		r = ((v1*1.1)/4);
		System.out.printf("O valor a ser pago em 4x é: R$%.2f!", r);
		
	}else {
		System.out.printf("Ops! opção inexistente!");
		}	
	}

}
