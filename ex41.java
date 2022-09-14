package entrada_processamento_saida;

import java.util.Scanner;

public class ex41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		/* Calcular e exibir a soma dos “N” primeiros valores da seqüência abaixo. O valor “N” será digitado, 
		 * deverá ser positivo, mas menor que cem. Caso o valor não satisfaça a restrição, 
		 * enviar mensagem de erro e solicitar o valor novamente. A seqüência: 2, 5, 10, 17, 26, ....*/
		int n, s1, s2, somador, soma;
		
		System.out.printf("Digite um número inteiro menor que 100: ");
		n = ler.nextInt();

		while (n > 99 || n < 0) { 
			System.out.printf("Número invalido! Tente novamente");
			System.out.printf("Digite um número inteiro menor que 100: ");
			n = ler.nextInt();}


		s1 = 2;
		somador = 3;
		soma = 0;
		
		System.out.printf("-> %d", s1);

		while (n > 0) {
			n = n - 1;
			s2 = s1 + somador; 
			somador = somador + 2;
			System.out.print(s2); 
			s1 = s2;
			soma = soma + s2;
			System.out.printf("-> %d",soma);}
	}

}
