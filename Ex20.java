package entrada_processamento_saida;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		/*20. Uma escola com cursos em regime semestral realiza duas avaliações durante o semestre e 
		 * calcula a média do aluno, da seguinte maneira: MEDIA = (P1 + 2.P2) / 3
		 * Fazer um programa para entrar via teclado com o valor da primeira nota (P1) e o 
		 * programa deverá calcular e exibir quanto o aluno precisa tirar na segunda nota minimamente (P2) 
		 * para ser aprovado, sabendo que a média de aprovação é igual a cinco.*/
		double p1, p2;
		
		System.out.printf("Digite a nota da p1: ");
		p1 = ler.nextDouble ();
		
		p2 = (15-p1)/2;
		
		System.out.printf("Você precisa tirar uma nota igual ou maior que %.2f para ser aprovado!", p2);   
	
	}

}
