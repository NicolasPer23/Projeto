import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Scanner ent = new Scanner(System.in);
        boolean rodar = true;

        while (rodar){
        System.out.println("-----CALCULADORA-----");
        System.out.println(" 1 - SOMAR ");
        System.out.println(" 2 - SUBTRAIR");
        System.out.println(" 3 - MULTIPLICAR");
        System.out.println(" 4 - DIVIDIR");
        System.out.println(" 0 - SAIR");
        int A = ent.nextInt();

        switch (A) {

            case 1:

                double soma1 = ent.nextDouble();
                double soma2 = ent.nextDouble();
                double resultadoS;

                resultadoS = soma1 + soma2;

                System.out.println("Resultado é: " + resultadoS);

                break;

            case 2:

                double sub1 = ent.nextDouble();
                double sub2 = ent.nextDouble();
                double resultadoSub;

                resultadoSub = sub1 - sub2;

                System.out.println("Resultado é: " + resultadoSub);

                break;

            case 3:

                double mul1 = ent.nextDouble();
                double mul2 = ent.nextDouble();
                double resultadomul;

                resultadomul = mul1 * mul2;

                System.out.println("Resultado é: " + resultadomul);

                break;

            case 4:

                double div1 = ent.nextDouble();
                double div2 = ent.nextDouble();
                double resultadodiv;

                if (div1 == 0) {
                    System.out.println("Erro");
                    break;
                }

                resultadodiv = div1 / div2;

                System.out.println("Resultado é: " + resultadodiv);

                break;

            case 0:
                return;

            default:
                System.out.println("Erro");

                break;
        }
        }
    }
}