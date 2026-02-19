import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Leia n (tamanho do array)
        System.out.print("Digite a quantidade de elementos (n): ");
        if (!scanner.hasNextInt()) return;
        int n = scanner.nextInt();

        int[] array = new int[n];

        // 2. Leia n números inteiros
        System.out.println("Digite os " + n + " números:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // 3. Leia o número x a ser buscado
        System.out.print("Digite o número (x) para buscar: ");
        int x = scanner.nextInt();

        // Variáveis para armazenar o resultado
        ArrayList<Integer> posicoes = new ArrayList<>();
        int contador = 0;

        // 4. Varredura (busca linear)
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                posicoes.add(i); // Guarda o índice (posição)
                contador++;       // Conta a frequência
            }
        }

        // 5. Informe os resultados
        System.out.println("\n--- Resultado da Busca ---");
        if (contador > 0) {
            System.out.println("O número " + x + " existe no array.");
            System.out.println("Aparece " + contador + " vez(es).");
            System.out.println("Índices (posições) onde aparece: " + posicoes);
        } else {
            System.out.println("O número " + x + " NÃO existe no array.");
        }

        scanner.close();
    }
}
