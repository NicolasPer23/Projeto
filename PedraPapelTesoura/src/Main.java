import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {


        boolean teste = true;
        Random gerador = new Random();
        Scanner ent = new Scanner(System.in);

        int vitoria = 0;
        int derrota = 0;
        int empate = 0;
        int contagemV = 0;
        int contagemD = 0;
        int contagemE = 0;

for(int i = 0; i < 3; i++) {
    System.out.println("--PEDRA PAPEL E TESOURA--");
    System.out.println("1 - PEDRA");
    System.out.println("2 - PAPEL");
    System.out.println("3 - TESOURA");

    int escolha = ent.nextInt();

    if (escolha > 3 || escolha < 1) {
        System.out.println("Erro");
        return;
    }
    int numero = gerador.nextInt(3);


    if (numero == 1) {
        System.out.println("Pedra");
        ;
    } else if (numero == 2) {
        System.out.println("Papel");
        ;
    } else if (numero == 3) {
        System.out.println("Tesoura");
    }


     if (escolha == numero) {
        System.out.println("Empate");
        contagemE++;
    } else if ((escolha == 1 && numero == 3) ||
            (escolha == 2 && numero == 1) ||
            (escolha == 3 && numero == 2)) {
        System.out.println("Você venceu");
        contagemV++;
    } else {
        System.out.println("Você perdeu");
        contagemD++;
    }

    System.out.println("Placar Atual");
    System.out.println("Vitória " + contagemV);
    System.out.println("Derrota " + contagemD);
    System.out.println("Empate " + contagemE);
}
        }
    }
