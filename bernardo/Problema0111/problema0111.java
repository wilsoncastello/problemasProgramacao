import java.util.Scanner;

public class problema0111 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        float numero1;
        float numero2;
        float soma;
        float resultado;

        // Entrada de valores
        System.out.println("Digite o primeiro número: ");
        numero1 = Float.valueOf(input.nextLine());
        System.out.println("Digite o segundo número: ");
        numero2 = Float.valueOf(input.nextLine());

        // Cálculo da soma e verificação
        soma = numero1 + numero2;
        if (soma > 20) {
            resultado = soma + 8;
        } else {
            resultado = soma - 5;
        }

        // Saída
        System.out.println("O número a ser apresentado é: " + resultado);
    }
}
