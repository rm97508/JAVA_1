package ddd;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, c;
		
		System.out.printf("Digite o valor A: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o valor B: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o valor C: ");
		c = ler.nextDouble();
		
		if (a + b <= c ) {
			System.out.printf("A soma de a + b é maior que c");
		}
		else {
			System.out.printf("A some de a + b não é maior que c");
		}
		
		ler.close();

	}

}
