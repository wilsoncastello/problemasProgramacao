import java.util.Scanner;

public class problema0151 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        float custo;
        float distribuidor;
        float impostos;
        float preco;

        // Entrada de valores
        System.out.println("Digite o custo de fábrica: ");
        custo = Float.valueOf(input.nextLine());

        // Cálculo do custo ao consumidor
        if (custo < 12000) {
            distribuidor = (float) (custo * 0.05);
            impostos = 0;
        } else if (custo <= 25000) {
            distribuidor = (float) (custo * 0.10);
            impostos = (float) (custo * 0.15);
        } else {
            distribuidor = (float) (custo * 0.15);
            impostos = (float) (custo * 0.20);
        }

        preco = custo + distribuidor + impostos;

        // Saída
        System.out.println("O custo ao consumidor é: R$" +  Math.round(preco * 100) / 100);
    }
}