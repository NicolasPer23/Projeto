import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);
        Random gerador = new Random();


       int teste = 0;
        int numero = gerador.nextInt(100) + 1;
        int contador = 0;


        while (teste != numero) {

            System.out.println("ADIVINHE O NUMERO");
            int N = ent.nextInt();
            contador++;

            if (N > numero) {
                System.out.println("Menor");

            }if (N < numero){
                System.out.println("Maior");


            } if (N == numero){
                    System.out.println("CORRETO!!!");
                    System.out.println("Numero de tentativas: " + contador);
                    return;
                }

            }

        }
    }
