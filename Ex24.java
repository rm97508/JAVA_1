package ddd;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome, sexo, ec, tc;
		
		System.out.printf("Digite o seu nome: ");
		nome = ler.next();
		
		System.out.printf("Digite o seu sexo: ");
		sexo = ler.next();
		
		System.out.printf("Digite o seu estado civil: ");
		ec = ler.next();
		
		if ((sexo == "F") && (ec == "CASADA")) {
			System.out.printf("Digite o tempo de casada em anos: ");
			tc = ler.next();
			System.out.printf(tc);
		}
		else {
			System.out.printf(nome, sexo, ec);
		}
		ler.close();

	}

}
