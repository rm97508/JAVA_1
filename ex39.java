package entrada_processamento_saida;

import java.util.Scanner;

public class ex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		/*39. Exibir os trinta primeiros valores da série de Fibonacci. A série: 1, 1, 2, 3, 5, 8, ...*/
		int n, t1, t2, t3, t4, cont;
		
		System.out.printf("Série de Fibonacci: ");
		
		n = 30; 
		t1 = 1; 
		t2 = 1;
		
		System.out.printf(" %d -> %d ", t1, t2);
		cont = 3;
		
		while (cont <= n) {
		    t3 = t1 + t2;
		    System.out.printf("-> %d ", t3);
		    t1 = t2; 
		    t2 = t3;
		    cont++; }
		System.out.printf("_Fim!");
		

	}

}
