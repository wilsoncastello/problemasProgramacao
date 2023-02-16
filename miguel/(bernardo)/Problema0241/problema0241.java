import java.util.Scanner;

public class problema0241 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        float[] vetorA = new float[10];
        float[] vetorB = new float[10];
        String saidaA = "";
        String saidaB = "";

        // Entrada de valores

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + " número: ");
            vetorA[i] = Float.valueOf(input.nextLine());
        }

        // Cálculo da multiplicação

        for (int i = 0; i < 10; i++) {
            if (vetorA[i] % 2 == 0) {
                vetorB[i] = vetorA[i] * 5;
            } else {
                vetorB[i] = vetorA[i] + 5;
            }
        }

        // Saída
        for (int i = 0; i < 10; i++) {
            saidaA += vetorA[i] + " ";
        }
        System.out.println("vetorA: " + saidaA);
        for (int i = 0; i < 10; i++) {
            saidaB += vetorB[i] + " ";
        }
        System.out.println("vetorB: " + saidaB);
    }
}