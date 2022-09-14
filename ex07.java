package entrada_processamento_saida;

import java.util.Scanner;

public class ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
	    double a,b,c,d,e,soma,pag,troco;	
	    
	    System.out.printf("Digite o valor do produto:  ");
	    a = ler.nextDouble();
	    
	    System.out.printf("Digite o valor do produto:  ");
	    b = ler.nextDouble();
	    
	    System.out.printf("Digite o valor do produto:  ");
	    c = ler.nextDouble();
	    
	    System.out.printf("Digite o valor do produto:  ");
	    d = ler.nextDouble();
	    
	    System.out.printf("Digite o valor do produto:  ");
	    e = ler.nextDouble();
	    
	    soma = a+b+c+d+e;
	    System.out.printf("o valor total �:  %.2f\n", soma);
	    
	    System.out.printf("Digite o valor do pagamento:  ");
	    pag = ler.nextDouble();
	    
	    troco = pag - soma;
	    
	    System.out.printf("O valor do troco �: %.2f ",troco); 
	    
	}

}
