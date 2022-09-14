package entrada_processamento_saida;

import java.util.Scanner;

public class ex40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		/*40. Exibir os vinte primeiros valores da série de Bergamaschi. A série: 1, 1, 1, 3, 5, 9, 17, ...*/
		int n, t1, t2, t3, t4, cont;
		
		System.out.printf("Série de Bergamaschi: ");
		
		n = 20; 
		t1 = 1; 
		t2 = 1;
		t3 = 1;
		System.out.printf(" %d -> %d ", t1, t2);
		cont = 3;
		
		while (cont <= n) {
		    t4 = t1 + t2 + t3;
		    System.out.printf("-> %d ", t4);
		    t1 = t2; 
		    t2 = t3;
		    t3 = t4;
		    cont++; }
		System.out.printf("_Fim!");
		

	}

}
