import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double av, bv;
		
		System.out.println("Digite o primeiro valor: ");
		av = ler.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		bv = ler.nextDouble();
		
		while (bv <= av) {
			System.out.println("O segundo valor digitado deve ser maior do que o primeiro");
			System.out.println("Digite o segundo valor (deve ser maior do que o primeiro): ");
			bv = ler.nextDouble();
		}
		
		System.out.println("O segundo valor digitado (" + bv + ") é maior do que o primeiro (" + av +")");

        ler.close();
	}
    

}
