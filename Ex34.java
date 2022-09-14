public class Ex34W {

    public static void main(String[] args) {
        int i = 1;
        int j = 1;

        while(i <= 10) {
            while(j <= 10) {
                System.out.println(i + " x " + j + " = " + (i * j));
                j++;
            }

            i++;
            j = 1;
        }
    }
}
