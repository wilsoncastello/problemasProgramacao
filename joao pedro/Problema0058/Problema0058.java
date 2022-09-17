import java.util.Scanner;

public class Problema0058 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int troco, valor, compra, x;

        System.out.println("Digite o valor da compra: ");
        valor = Integer.valueOf(input.nextLine());
        System.out.println("Digite o quanto sera pago na compra: ");
        compra = Integer.valueOf(input.nextLine());

        troco = compra - valor;

        System.out.println("Troco: " + troco);
        System.out.println("Valor da compra: " + valor);

        x = troco / 100;
        System.out.println("Notas de 100:" + x);

        troco = troco - (100 * x);

        x = troco / 10;
        System.out.println("Notas de 10:" + x);

        troco = troco - (10 * x);
        x = troco % 100;
        System.out.println("Notas de 1:" + x);

    }

}