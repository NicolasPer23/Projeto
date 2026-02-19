import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner ent = new Scanner(System.in);

        System.out.println("Digite 3 números");
        int A = ent.nextInt();
        int B = ent.nextInt();
        int C= ent.nextInt();


        if (A == B && B == C){
            System.out.println("Erro");
        return;
        }

        if(A >= B && A >=C){
            System.out.println("Maior: " + A);
        }else{
            System.out.println(' ');

        }if (B >= A && B>= C){
            System.out.println("Maior: " + B);
        }else {
            System.out.println(' ');
        }
            if (C >= A && C >= B){
                System.out.println("Maior: " + C);
            }else{
                System.out.println(' ');
            }




    }
}