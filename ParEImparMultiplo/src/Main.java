import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        int A = ent.nextInt();


        if(A % 2 == 0){
            System.out.println("Par");
        }else {
            System.out.println("Ímpar");
        }

        if(A % 3 == 0){
            System.out.println("Múltiplo de 3");
        }else{
            System.out.println("Não é Múltiplo de 3");
        }

        if(A % 5 == 0){
            System.out.println("Multiplo de 5");
        }else{
            System.out.println("Não é Múltiplo de 5");
        }


    }
}