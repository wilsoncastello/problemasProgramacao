import java.util.Scanner;

public class problema0081 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        int numero;

        // Entrada de valores
        System.out.println("Digite um número: ");
        numero = Integer.valueOf(input.nextLine());

        // Verificação se o número é par e saída
        if (numero % 2 == 0) {
            System.out.println("É par");
        } else {
            System.out.println("Não é par");
        }
    }
}
