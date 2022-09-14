package ddd;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n;
		
		System.out.printf("Digite um número: ");
		n = ler.nextDouble();
		
		if (n % 2 == 0) {
			System.out.print(n + 5);
		}
		else {
			System.out.print (n + 8);
		}
		ler.close();

	}

}
