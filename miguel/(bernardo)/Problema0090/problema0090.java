import java.util.Scanner;

public class problema0090 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        float compra;
        float desconto;
        float valor;

        // Entrada de valores
        System.out.println("Digite o valor da compra: ");
        compra = Float.valueOf(input.nextLine());

        // Cálculo do desconto e valor final da compra
        if (compra >= 5000) {
            desconto = (float) (compra * 0.20);
            valor = compra - desconto;
        } else {
            desconto = (float) (compra * 0.15);
            valor = compra - desconto;
        }

        // Saída
        System.out.println("Desconto R$: " + Math.round(desconto * 100) / 100);
        System.out.println("Valor final da compra R$: " + Math.round(valor * 100) / 100);
    }
}
