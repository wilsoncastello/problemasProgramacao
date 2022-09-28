import java.util.Scanner;

public class problema0172 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        int soma = 0;
        int num = 0;
        int idade = 42;
        int media;

        // Entrada de valores
        while (idade != 0) {
            num++;
            System.out.println("Digite a " + num + " idade: ");
            idade = Integer.valueOf(input.nextLine());
            soma += idade;
        }

        // Cálculo da média das idades
        if (num != 1) {
            num--;
        }
        media = soma / num;

        // Saída
        System.out.println("A média das idades é: " + media);
    }
}
