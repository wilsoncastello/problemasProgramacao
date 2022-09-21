import java.util.Scanner;

public class problema0141 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        float a;
        float b;
        float c;
        float soma;

        // Entrada de valores
        System.out.println("Digite o primeiro número: ");
        a = Float.valueOf(input.nextLine());
        System.out.println("Digite o segundo número: ");
        b = Float.valueOf(input.nextLine());
        System.out.println("Digite o terceiro número: ");
        c = Float.valueOf(input.nextLine());

        // Cálculo da soma e saída
        soma = a + b + c;
        if (soma >= 100) {
            System.out.println("O resultado da soma é: " + soma);
        } else {
            System.out.println("O resultado não pode ser apresentado");
        }
    }
}
