import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);


        System.out.printf("Escolha uma opção 1 Celsus para Fahrenheit 2 ao Contrário ");
        int opcao = ent.nextInt();

        switch (opcao) {

            case 1:
                System.out.printf("Digite a Temperatura");

                double B = ent.nextDouble();

                double Fahrenheit = B * 9 / 5 + 32;
                System.out.println("Fahrenheit = " + Fahrenheit);

                break;

            case 2:
                System.out.printf("Digite a Temperatura");

                double A = ent.nextDouble();

                double Celsius = (A - 32) * 5/9;
                System.out.println("Celsius = " + Celsius);
                break;

            default:
                System.out.printf("erro");;

                break;
        }
    }
}