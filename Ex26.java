package ddd;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n;
		
		System.out.printf("Digite um número: ");
		n = ler.nextDouble();
		
		if (n >= 0) {
			System.out.print(n * 2);
		}
		else {
			System.out.print(n * 3);
		}
		ler.close();

	}

}
