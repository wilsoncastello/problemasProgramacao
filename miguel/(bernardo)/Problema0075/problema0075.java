import java.util.Scanner;

public class problema0075 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        float cotacao;
        float dolares;
        float reais;

        // Entrada de valores
        System.out.println("Digite a cotação do dólar: ");
        cotacao = Float.valueOf(input.nextLine());
        System.out.println("Digite a quantidade de dólares: ");
        dolares = Float.valueOf(input.nextLine());

        // Cálculo do peso em gramas
        reais = dolares * cotacao;

        // Saída
        System.out.println("O valor convertido em reais é: R$" + Math.round(reais * 100) / 100);
    }
}
