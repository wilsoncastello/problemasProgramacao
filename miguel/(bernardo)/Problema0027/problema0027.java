import java.util.Scanner;

public class problema0027 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        float quilos;
        float gramas;

        // Entrada de valores
        System.out.println("Digite o peso (em quilos): ");
        quilos = Float.valueOf(input.nextLine());

        // Cálculo do peso em gramas
        gramas = quilos * 1000;

        // Saída
        System.out.println("O peso em gramas é: " + gramas);
    }
}
