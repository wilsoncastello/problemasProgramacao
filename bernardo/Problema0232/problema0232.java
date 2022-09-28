import java.util.Scanner;

public class problema0232 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        float massa;
        float segundos = 0;

        // Entrada de valores
        System.out.println("Digite a massa (em  gramas): ");
        massa = Float.valueOf(input.nextLine());

        // Cálculo do tempo necessário
        while (massa >= 0.05) {
            massa /= 2;
            segundos += 50;
        }

        // Saída
        System.out.println("O tempo necessário é: " + segundos + " segundos");
    }
}
