import java.util.Scanner;

public class Problema0089 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angulo = 0;

        System.out.println("Digite um angulo para ser classificado em agudo/reto/obtuso: ");
        angulo = Double.valueOf(input.nextLine());

        if (angulo == 90) {
            System.out.println("O angulo de " + angulo + " e: Reto");

        } else {
            if (angulo > 90) {
                System.out.println("O angulo de " + angulo + " e: Obtuso");

            } else {
                System.out.println("O angulo de " + angulo + " e: Agudo");

            }

        }

    }

}