import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);

        String senha = ent.nextLine();

    int contagem = 0;
    for(char c  : senha.toLowerCase().toCharArray()) {
    if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
       contagem++;}
    }
        System.out.println(contagem);
    }

}

