package ddd;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n;
		
		System.out.printf("Digite um número: ");
		n = ler.nextDouble();
		if ((n % 2) == 0) {
			System.out.printf("O número é par");
		}
		else {
			System.out.printf("O número é ímpar: ");
		}
		ler.close();

	}

}
