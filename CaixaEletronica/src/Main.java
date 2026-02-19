import java.util.Scanner;

public class DecomposicaoNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inteiro em reais (R$): ");
        int valor = scanner.nextInt();
        int valorOriginal = valor;

        // Notas disponíveis
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        int[] quantidadeNotas = new int[notas.length];

        // Lógica de Decomposição (Greedy Algorithm)
        for (int i = 0; i < notas.length; i++) {
            quantidadeNotas[i] = valor / notas[i]; // Divisão inteira (quantidade de notas)
            valor = valor % notas[i]; // Módulo (valor restante)
        }

        // Exibição dos resultados
        System.out.println("Valor: R$ " + valorOriginal);
        for (int i = 0; i < notas.length; i++) {
            System.out.println(quantidadeNotas[i] + " nota(s) de R$ " + notas[i] + ",00");
        }

        scanner.close();
    }
}
