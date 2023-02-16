import java.util.Scanner;

public class problema0043 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        float numero;
        float log;

        // Entrada de valores
        System.out.println("Digite o peso (em quilos): ");
        numero = Float.valueOf(input.nextLine());

        // Cálculo do peso em gramas
        log = (float) Math.log10(numero);

        // Saída
        System.out.println("O logaritmo(base 10) de " + numero + " é: " + log);
    }
}
