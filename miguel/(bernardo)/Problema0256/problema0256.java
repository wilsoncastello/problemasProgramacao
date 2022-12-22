import java.util.Scanner;

public class problema0256 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        int vetor[] = new int[8];
        int numero;
        int intermediario;
        String saida = "";

        // Entrada de valores e ordenação
        for (int i = 0; i < 8; i++) {
            System.out.println("Digite o " + (i + 1) + " número: ");
            numero = Integer.valueOf(input.nextLine());
            for (int j = 0; j < i; j++) {
                if (numero < vetor[j]) {
                    intermediario = vetor[j];
                    vetor[j] = numero;
                    numero = intermediario;
                }
            }
            vetor[i] = numero;
        }

        // Saída

        for (int i = 0; i < 8; i++) {
            saida += vetor[i] + " ";
        }
        System.out.println("MatrizA: " + saida);
    }
}