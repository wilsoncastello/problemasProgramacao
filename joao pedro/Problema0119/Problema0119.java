import java.util.Scanner;

public class Problema0119 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double n1 = 0, n2 = 0;

        System.out.println("Digite um valor: ");
        n1 = Double.valueOf(input.nextLine());
        System.out.println("Digite um valor: ");
        n2 = Double.valueOf(input.nextLine());

        if (n1 > n2) {
            double quadrado = n2 * n2;
            double raiz = Math.sqrt(n1);
            System.out.println("O menor numero elevado ao quadrado: " + quadrado);
            System.out.println("A raiz quadrada do maior numero: " + raiz);

        } else {
            double quadrado = n1 * n1;
            double raiz = Math.sqrt(n2);
            System.out.println("O menor numero elevado ao quadrado: " + quadrado);
            System.out.println("A raiz quadrada do maior numero: " + raiz);

        }

    }
}
