import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Produto {
    private double preco;
  private  String nome;
  private List<String> produto = new ArrayList<>();
  private List<Double> precos = new ArrayList<>();

          public String toString(){
      return nome;
          }

    public void dictionary(Scanner nome){
        System.out.println("Digite o nome do produto: ");
        produto.add(nome.nextLine());

    } public void dictionary2(Scanner preco){
        System.out.println("Digite o preço do produto: ");
        precos.add(preco.nextDouble());
    }
}
