package entrada_processamento_saida;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		/*19. Uma escola com cursos em regime semestral, realiza duas avaliações durante o semestre e 
		 * calcula a média do aluno, da seguinte maneira: MEDIA = (P1 + 2.P2) / 3
		 * Fazer um programa para entrar via teclado com os valores das notas (P1 e P2) e calcular a média. 
		 * Exibir a situação final do aluno (“Aprovado ou Reprovado”), sabendo que a média de 
		 * aprovação é igual a cinco.*/
		double p1, p2, med;
		
		System.out.printf("Digite a nota da p1: ");
		p1 = ler.nextDouble ();
		
		System.out.printf("Digite a nota da p2: ");
		p2 = ler.nextDouble ();
		
		med = (p1+2*p2)/3;
		
		if (med >= 5) {
		    System.out.printf("A sua nota corresponde a %.2f, portanto, você está aprovado!", med);   
		}else { 
			System.out.printf("A sua nota corresponde a %.2f, portanto, você está reprovado!", med);}
		
		
	}

}
