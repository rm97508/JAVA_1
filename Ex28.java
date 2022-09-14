package ddd;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v1, v2, v3;
		
		System.out.printf("Digite o primeiro valor: ");
		v1 = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		v2 = ler.nextInt();
		
		System.out.printf("Digite o terceiro valor: ");
		v3 = ler.nextInt();
		
		if ((v1 > v2 ) && (v1 > v3) && (v2 > v3)) {
			System.out.print(v3);
			System.out.print(v2);
			System.out.print(v1);
		}
		if ((v1 > v2 ) && (v1 > v3) && (v3 > v2)) {
			System.out.print(v2);
			System.out.print(v3);
			System.out.print(v1);
		}
		else if ((v2 > v1 ) && (v2 > v3) && (v1 > v3)) {
			System.out.print(v3);
			System.out.print(v1);
			System.out.print(v2);
		}
		else if ((v2 > v1 ) && (v2 > v3) && (v3 > v1)) {
			System.out.print(v1);
			System.out.print(v3);
			System.out.print(v2);
		}
		else if ((v3 > v1 ) && (v3 > v2) && (v2 > v1)) {
			System.out.print(v1);
			System.out.print(v2);
			System.out.print(v3);
		}
		else if ((v3 > v1 ) && (v3 > v2) && (v1 > v2)) {
			System.out.print(v2);
			System.out.print(v1);
			System.out.print(v3);
		}
		ler.close();
	}

}
