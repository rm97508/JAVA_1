package entrada_processamento_saida;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		/* 21. Entrar via teclado com dois valores quaisquer. Após a digitação, exibir um seletor de opções 
		 * (“menu”) com as seguintes opções: (Fazer esse exercício utilizando If..Else e/ou Case)
		 * 1 – Multiplicação
		 * 2 – Adição
		 * 3 – Divisão
		 * 4 – Subtração
		 * 5 – Fim de processo (sair do programa)
		 * Solicitar uma opção por parte do usuário, verificar se é ou não uma opção válida (letras ou números) 
		 * e processar a respectiva operação. Enviar mensagem de erro se a opção escolhida não existir no 
		 * seletor.Encerrar o programa somente quando o usuário escolher a opção de finalização. 
		 * Repare que a opção de número três é de divisão e o programa deverá enviar mensagem de erro, 
		 * (somente nesta opção) se o denominador for zero.*/
		 
		double add, v1, v2, soma, sub, mult, div;
		
		System.out.printf("Digite o primeiro valor: ");
		v1 = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		v2 = ler.nextDouble();
		
		System.out.printf("Escolha a operação desejada: \r\n"
				+ "		 * 1 – Multiplicação\r\n"
				+ "		 * 2 – Adição\r\n"
				+ "		 * 3 – Divisão\r\n"
				+ "		 * 4 – Subtração\r\n"
				+ "		 * 5 – Fim de processo (sair do programa):_");
		add = ler.nextDouble();
		
		
		if (add == 1 ) {
			mult = v1*v2;
			System.out.printf("O resultado é: %.2f!", mult);
			
		}else if (add == 2) {
			soma = v1+v2;
			System.out.printf("O resultado é: %.2f!", soma);
		}else if (add == 3) {
			if (v1==0) {
				System.out.printf("O denominador deve ser diferente de zero!");
			}else {
				div = v1/v2;
				System.out.printf("O resultado é: %.2f!",div);
			}
		}else if (add == 4) {
			sub = v1-v2;
			System.out.printf("O resultado é: %.2f!",sub);
		}else if (add == 5) {
			System.out.printf("Fim do processo, até logo!");
		}else {
			System.out.printf("Ops! opção inexistente!");
		}
		
		
	}

}
