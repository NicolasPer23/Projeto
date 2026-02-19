import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner ent = new Scanner(System.in);

        int N = ent.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println("De 1 a N: " + i);
        }
        for (int i = 1; i <= N; i++) {
            System.out.println("Soma de 1 a N: " + i);
            i++;
        }
        for (int i = 1; i <= N; i++) {

            if (i % 2 == 0) {
                System.out.println("Pares: " + i);
                i++;
            }
        }
    }
}