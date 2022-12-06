import java.util.Scanner;

public class problema0196 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        int numero1;
        int numero2;
        int resultado = 0;

        // Entrada de valores
        System.out.println("Digite o 1 número: ");
        numero1 = Integer.valueOf(input.nextLine());
        System.out.println("Digite o 2 número: ");
        numero2 = Integer.valueOf(input.nextLine());

        // Cálculo da multiplicação
        for (var i = 0; i < numero2; i++) {
            resultado += numero1;
        }

        // Saída
        System.out.println("O resultado da multiplicação é: " + resultado);
    }
}