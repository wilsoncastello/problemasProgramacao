import java.util.Scanner;

public class problema0202 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        float num;
        int quantidade = 0;

        // Entrada de valores e verificação de números maiores que 30
        for (int i = 0; i < 15; i++) {
            System.out.println("Digite o " + (i + 1) + " número: ");
            num = Float.valueOf(input.nextLine());
            if (num > 30) {
                quantidade++;
            }
        }

        // Saída
        System.out.println("A quantidade de números maiores que 30 é: " + quantidade);

    }
}
