import java.util.Scanner;

public class problema0226 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        int numero;
        int razao = 3;
        int soma = 0;
        int termo = 3;

        // Entrada de valores
        System.out.println("Digite o número de termos: ");
        numero = Integer.valueOf(input.nextLine());

        // Cálculo da soma dos termos

        if (numero > 0) {
            for (int i = 0; i < numero; i++) {
                soma += termo;
                termo *= razao;
            }
        }

        // Saída
        System.out.println(" O resultado da soma até o " + numero + " termo é: " + soma);

    }
}