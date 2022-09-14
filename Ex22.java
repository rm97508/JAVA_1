package ddd;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double lado, base, area, altura, raio;
		
		int opcao;
		
		System.out.println("-------------Calculadora de área-------------");
		System.out.println("1 - Triângulo");
		System.out.println("2 - Quadrado");
		System.out.println("3 - Retângulo");
		System.out.println("4 - Círculo");
		System.out.println("5 - Fim do processo");
		System.out.println("---------------------------------------------");
		
		System.out.printf("Digite sua opção: ");
		opcao = ler.nextInt();
		
		if (opcao == 1) {
			System.out.printf("Digite o valor da base: ");
			base = ler.nextDouble();
			System.out.printf("Digite o valor da altura: ");
			altura = ler.nextDouble();
			area = (base * altura) / 2;
			System.out.printf("A área do triângulo é %.2f", area);
		}
		else if (opcao == 2) {
			System.out.printf("Digite o valor do lado: ");
			lado = ler.nextDouble();
			area = lado * lado;
			System.out.printf("A área do quadrado é %.2f", area);
		}
		else if (opcao == 3) {
			System.out.printf("Digite o valor da base: ");
			base = ler.nextDouble();
			System.out.printf("Digite o valor da altura: ");
			altura = ler.nextDouble();
			area = base * altura;
			System.out.printf("A área do retângulo é %.2f", area);
		}
		else if (opcao == 4) {
			System.out.printf("Digite o valor do raio: ");
			raio = ler.nextDouble();
			area = 3.14 * (raio * raio);
			System.out.printf("A área do circulo é %.2f", area);
		}
		ler.close();


	}

}
