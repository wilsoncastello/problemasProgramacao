import java.util.Scanner;

public class problema0037{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Double dinheiro, parte1, parte2, parte3;

        System.out.print("Digite a quantidade total de dinheiro: ");
        dinheiro = Double.parseDouble(input.nextLine());

        parte1 = (dinheiro / 3) / 5.10;
        System.out.println("Dinheiro em dólar: " + parte1);

        parte2 = (dinheiro / 3) / 5.30;
        System.out.println("Dinheiro em euro: " + parte2);

        parte3 = (dinheiro / 3) / 6.05;
        System.out.println("Dinheiro em libra: " + parte3);
    }

}