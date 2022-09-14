import java.util.Scanner;

public class Ex36DW {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int ct = 1;
        int tt = 1;
        int v = 0;

         do {
            System.out.print("Entre com um valor: ");
            v = entrada.nextInt();
        }while (v < 0);

        System.out.print("Entre com começo da tabuada: ");
        ct = entrada.nextInt();

        do {
            System.out.print("Entre com o final da tabuada:");
                tt = entrada.nextInt();
        } while (ct > tt);

        do {
            System.out.println(v * tt);
            tt--;
        } while (tt >= ct);
        entrada.close();
    }
}
