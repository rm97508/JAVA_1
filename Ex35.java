import java.util.Scanner;

public class Ex35W {

    public static void main(String[] args) {
            int i = 1;
            int j = 1;
            int valor = 0;

            Scanner entrada = new Scanner(System.in);
            System.out.print("Entre com um valor: ");
            valor = entrada.nextInt();

            while(valor < 0){
                System.out.print("Entre com um valor: ");
                valor = entrada.nextInt();

            }

            // Processamento
           while(i <= valor){
            j = 1;
            while(j <= 10){
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }

            i++;
           }
           entrada.close();

    }
}
