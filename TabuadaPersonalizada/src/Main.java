import java.util.Scanner;

public class  Main{
    public static void main(String[] args){

        Scanner ent = new Scanner(System.in);
        boolean rodar = true;
        boolean calculo = true;

        while(rodar){
            System.out.println("TABUADA INTELIGENTE");
            System.out.print("Digite o Número: ");
            int A = ent.nextInt();
            System.out.println("Quantas vezes você quer multiplicalo: ");
            int X = ent.nextInt();
            while(calculo){
                for(int i = 1; i <= X; i++){
                    System.out.println("Resultado: " + A * i);
                }
                return;
            }


        }
    }
}