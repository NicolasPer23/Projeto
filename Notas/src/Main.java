import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner ent = new Scanner(System.in);

        int N, i;



        System.out.println("Digite a quantidade de alunos: ");
        N = ent.nextInt();

        double[] vet = new double[N];



        for(i = 0; i < N; i++){
            System.out.println("Digite as notas: ");
            vet[i] = ent.nextDouble();
        }

          double media = 0;

        for(i =0; i < N; i++){
            media = media + vet[i];
        }

        media = media/N;

        System.out.println("A média é:  " + media);

    int contagem = 0;

        for( i = 0; i < N; i++){
            if(vet[i] > media) {
               contagem++;
            }
        }
        System.out.println("Numero de alunos acima da media: " + contagem);

        double j = vet[0];
        double j1 = vet[0];

        for(i = 1; i < N; i++){
            if(vet[i] > j){
                j = vet[i];
            }else if (vet[i] < j1){
                j1 = vet[i];
            }

        }    System.out.println("Maior nota é: " + j);
        System.out.println("A menor nota é: " + j1);


        }
        }




