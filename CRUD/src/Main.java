import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    String nome;
    double preco;
    int quantidade;

    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}

public class MiniEstoque {

    static ArrayList<Produto> estoque = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;

        do {
            mostrarMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    listarProdutos();
                    break;
                case 3:
                    atualizarQuantidade();
                    break;
                case 4:
                    removerProduto();
                    break;
                case 5:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 5);
    }

    static void mostrarMenu() {
        System.out.println("\n===== MENU ESTOQUE =====");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar produtos");
        System.out.println("3 - Atualizar quantidade");
        System.out.println("4 - Remover produto");
        System.out.println("5 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    static void cadastrarProduto() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        // Verificar duplicidade
        for (Produto p : estoque) {
            if (p.nome.equalsIgnoreCase(nome)) {
                System.out.println("Erro: Produto já cadastrado!");
                return;
            }
        }

        System.out.print("Preço: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        estoque.add(new Produto(nome, preco, quantidade));
        System.out.println("Produto cadastrado com sucesso!");
    }

    static void listarProdutos() {
        if (estoque.isEmpty()) {
            System.out.println("Estoque vazio.");
            return;
        }

        System.out.println("\n--- Lista de Produtos ---");
        for (Produto p : estoque) {
            System.out.println("Nome: " + p.nome +
                    " | Preço: R$" + p.preco +
                    " | Quantidade: " + p.quantidade);
        }
    }

    static void atualizarQuantidade() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        for (Produto p : estoque) {
            if (p.nome.equalsIgnoreCase(nome)) {
                System.out.print("Nova quantidade: ");
                int novaQtd = scanner.nextInt();
                p.quantidade = novaQtd;
                System.out.println("Quantidade atualizada com sucesso!");
                return;
            }
        }

        System.out.println("Erro: Produto não encontrado.");
    }

    static void removerProduto() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        for (Produto p : estoque) {
            if (p.nome.equalsIgnoreCase(nome)) {
                estoque.remove(p);
                System.out.println("Produto removido com sucesso!");
                return;
            }
        }

        System.out.println("Erro: Produto não encontrado.");
    }
}
