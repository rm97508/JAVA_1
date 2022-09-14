package entrada_processamento_saida;

import java.util.Scanner;

public class ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		/* 15. A partir de três valores que serão digitados, verificar se formam ou não um triângulo. 
		 * Em caso positivo, exibir sua classificação: “Isósceles, escaleno ou eqüilátero”. 
		 * Um triângulo escaleno possui todos os lados diferentes, o isósceles, dois lados iguais e o 
		 * eqüilátero, todos os lados iguais. Para existir triângulo é necessário que a soma de dois lados 
		 * quaisquer seja maior que o outro, isto, para os três lados*/
		
		double a, b, c, t;
		
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o terceiro valor: ");
		c = ler.nextDouble();
		
				 
		if (a+b>c && c+b>a && a+c>b) {
			System.out.println("Os valores indicados formam um triangulo!");
			if (a==b && b==c) {
				System.out.print("Esse triangulo é eqüilátero!");
			} else if (a!=c && c!=b) {
				        System.out.printf("Esse triangulo é escaleno!");
			}else {
				System.out.printf("Esse triangulo é isósceles!");}
		}else {
			System.out.printf("Esses valores não formam um triangulo!");
		}
	}
}
