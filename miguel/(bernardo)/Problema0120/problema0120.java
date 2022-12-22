import java.util.Scanner;

public class problema0120 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        float salario;
        float desconto;

        // Entrada de valores
        System.out.println("Digite o valor do salário: ");
        salario = Float.valueOf(input.nextLine());

        // Cálculo do desconto
        if (salario <= 600) {
            desconto = 0;
        } else if (salario <= 1200) {
            desconto = (float) (salario * 0.20);
        } else if (salario <= 2000) {
            desconto = (float) (salario * 0.25);
        } else {
            desconto = (float) (salario * 0.30);
        }

        // Saída
        System.out.println("Desconto R$: " + Math.round(desconto * 100) / 100);
    }
}
