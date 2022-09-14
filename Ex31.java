import java.util.Scanner;

public class Ex31dw {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double v;
        do {
            System.out.printf("Digite o valor do produto: ");
            v = ler.nextDouble();
        } while (v < 0);

        ler.close();

    }

}
