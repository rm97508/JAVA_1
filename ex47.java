package entrada_processamento_saida;

import java.util.Scanner;

public class ex47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		/*47. Calcular o fatorial de um valor que será digitado. Este valor não poderá ser negativo. Enviar mensagem de erro e 
		 * solicitar o valor novamente, se necessário. Perguntar se o usuário deseja ou não fazer um novo cálculo, consistir a 
		 * resposta em “S” ou “N”. N! = N x N-1 x N-2 x N-3 x ....... x (N - (N-1)) Ex: 5! = 5 x 4 x 3 x 2 x 1 = 120*/
		
		int num, fatorial = 1;
		
		System.out.print("Entre com um número inteiro positivo: ");
		num = ler.nextInt();
		
		 while (num > 0) {
		 fatorial *= num--;
		 }
		 
		 System.out.printf("O resultado fatorial é %d!", fatorial);
		
	}

}
