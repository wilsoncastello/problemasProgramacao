import java.util.Scanner;

public class problema0053{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, res;

        System.out.print("Digite um numerador: ");
        a = Double.parseDouble(input.nextLine());

        System.out.print("Digite um denominador, não pode ser 0: ");
        b = Double.parseDouble(input.nextLine());

        res = a / b;

        System.out.print("Resultado = " + res);
    }
}