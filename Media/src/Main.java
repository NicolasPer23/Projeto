import java.util.Scanner;




public class Main{
    public static void main(String[] args){

        Scanner ent = new Scanner(System.in);

        double A = ent.nextDouble();
        double B = ent.nextDouble();
        double C = ent.nextDouble();
        double soma, media;


        soma = A + B + C;
        System.out.println("Soma é: " + soma);

        media = soma / 3.0;

        System.out.println("Média é: " + media);


        if(A  >= B && A >= C){
            System.out.println("Maior " + A);
        }if(B >=  A && B >= C) {
            System.out.println("Maior " + B);
        }if(C >= A && C >= B){
            System.out.println("Maior " + C);
        }

        if(A  <= B && A <= C){
            System.out.println("Menor " + A);
        }if(B <=  A && B <= C) {
            System.out.println("Menor " + B);
        }if(C <= A && C <= B){
            System.out.println("Menor " + C);
        }


    }
}
