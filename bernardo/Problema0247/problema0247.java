import java.util.Scanner;

public class problema0247 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        float matrizA[] = new float[20];
        float matrizB[] = new float[20];
        int tamanho = 20;

        // Entrada de valores
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o " + (i + 1) + " número: ");
            matrizA[i] = Float.valueOf(input.nextLine());
        }

        // Cálculo da matrizB
        for (int i = 0; i < tamanho; i++) {
            matrizB[i] = matrizA[tamanho - 1 - i];
        }

        // Saída
        System.out.println("\nMatrizA:\n");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(matrizA[i]);
        }
        System.out.println("\nMatrizB:\n");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(matrizB[i]);
        }
    }
}
