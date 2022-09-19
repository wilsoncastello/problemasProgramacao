import java.util.Scanner;

public class Problema0104 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float n1 = 0, n2 = 0, n3 = 0, n4 = 0;

        System.out.println("Digite 3 numeros em ordem crescente (Sem repeticoes): ");
        n1 = Float.valueOf(input.nextLine());
        n2 = Float.valueOf(input.nextLine());
        n3 = Float.valueOf(input.nextLine());
        System.out.println("Digite 1 numero (Sem repetir os anteriores): ");
        n4 = Float.valueOf(input.nextLine());

        if (n4 > n3) {
            System.out.println("Numeros em ordem decrescente: " + n4 + " , " + n3 + " , " + n2 + " , " + n1);

        } else {
            if (n3 > n4 && n4 > n2) {
                System.out.println("Numeros em ordem decrescente: " + n3 + " , " + n4 + " , " + n2 + " , " + n1);

            } else {
                if (n3 > n4 && n2 > n4 && n4 > n1) {
                    System.out.println("Numeros em ordem decrescente: " + n3 + " , " + n2 + " , " + n4 + " , " + n1);

                } else {
                    System.out.println("Numeros em ordem decrescente: " + n3 + " , " + n2 + " , " + n1 + " , " + n4);

                }

            }

        }

    }
}
