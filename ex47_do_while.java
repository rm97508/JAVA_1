package entrada_processamento_saida;

import java.util.Scanner;

public class ex47_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		Scanner ent = new Scanner(System.in);
		/*47. Calcular o fatorial de um valor que será digitado. Este valor não poderá ser negativo. Enviar mensagem de erro e 
		 * solicitar o valor novamente, se necessário. Perguntar se o usuário deseja ou não fazer um novo cálculo, consistir a 
		 * resposta em “S” ou “N”. N! = N x N-1 x N-2 x N-3 x ....... x (N - (N-1)) Ex: 5! = 5 x 4 x 3 x 2 x 1 = 120*/
		
        int num, fat = 1, cont = 1;

        do{
            System.out.printf("Digite o valor que deseja fatorar: ");
            num = ent.nextInt();
            
            for(int i = 1;i <= num; i++){
                fat = fat * i;
            }
            
            System.out.printf("O resultado fatorial do número %d é %d!", num, fat);
            cont++; 
            }while(cont < 2);
 }
}