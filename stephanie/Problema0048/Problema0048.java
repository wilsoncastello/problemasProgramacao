package stephanie.Problema0048;
import java.util.Scanner;

public class Problema0048 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite a razão da PA: ");
    double r = Double.valueOf(input.nextLine());
    System.out.print("Digite o primeiro termo da PA: ");
    double a1 = Double.valueOf(input.nextLine());
    double a5 = a1 + 4*r;
    System.out.print("O quinto termo da PA é "+a5);
}
}