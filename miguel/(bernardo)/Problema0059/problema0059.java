import java.util.Scanner;

public class problema0059 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        int ano;
        boolean bissexto;

        // Entrada de valores
        System.out.println("Digite o ano ");
        ano = Integer.valueOf(input.nextLine());
        // Verificação do ano
        bissexto = (ano % 4 == 0 && !(ano % 100 == 0) || ano % 400 == 0);

        // Saída
        System.out.println("O ano é bissexto: " + bissexto);
    }
}
