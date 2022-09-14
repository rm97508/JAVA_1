import java.util.Scanner;

public class Ex37DW {

    public static void main(String[] args) {

    Scanner entrada = new Scanner(System.in);
    
    int i = 1;
    int j = 1;

    do {
        do {
            System.out.println(i + " x " + j + " = " + (i * j));
            j++;
        } while (j <= 10);

        System.out.print("Digite algo para continuar ");
        entrada.next();

        i++;
        j = 1;
    } while (i <= 20);
    entrada.close();

    }
}
