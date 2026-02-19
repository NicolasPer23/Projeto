import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ent = new Scanner(System.in);


        System.out.println("Digite uma senha forte ");
        String senha = ent.nextLine();


        if (SenhaCerta(senha)) {
            System.out.println("Senha correta");
        } else {
            System.out.println("Erro");
        }
    }//Valida a senha se ela está correta.


        public static boolean SenhaCerta (String senha) {

            if(senha.length() < 8){
                System.out.println("Erro");
                return false;
            }//Aprendi que o length ele conta os caracteres ou seja se maior que 8 erro se menor Erro

            boolean LetraMaiuscula = false;
            boolean LetraMinuscula = false;
            boolean Digito = false;
            boolean CaracterEspecial = false;
            //Decidi por deixar tudo false por conta do vídeo que vi para me auxiliar, mas indiferente o resultado é o mesmo

            for(int s : senha.toCharArray()){//Esse toCharArray, como o nome transforma uma string em uma cadeia de caracteres ou seja criando um espaço para cada um no sistema


                if(Character.isUpperCase(s)){//Character.isUpperCase, verifica se tem algum caracter  maiuscula se sim volta verdadeiro e vai para etapa seguinte
                    LetraMaiuscula = true;
                } if
                (Character.isLowerCase(s)){//Character.isLowerCase, verifica  se tem algum caracter minusculo
                        LetraMinuscula = true;
                    }  if
                        (Character.isDigit(s)){//Character.isDigit, verifica se tem algum numero
                            Digito = true;
                        } else if (!Character.isLetterOrDigit(s)) {//! verifica se é diferente de Letra ou digito, e o CHaracter.IsletterorDigit verifica se tem letra ou numero porém ! fala se tem algo diferente ou seja caracter especial
                    CaracterEspecial = true;
                        }
                    }
            return LetraMaiuscula && LetraMinuscula && Digito && CaracterEspecial;// Return fora do for, validando a senha
        }
    }
