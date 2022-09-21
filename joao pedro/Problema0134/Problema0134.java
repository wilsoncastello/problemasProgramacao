import java.util.Scanner;

public class Problema0134 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double angulo = 0, seno = 0, cosseno = 0;

        System.out.println("Digite um angulo: ");
        angulo = Double.valueOf(input.nextLine());

        if ((angulo >= 90 && angulo <= 180) || (angulo >= 270 && angulo <= 360)) {
            seno = Math.sin(Math.toRadians(angulo));
            System.out.println("Seno de " + angulo + ": " + seno);

        } else {
            cosseno = Math.cos(Math.toRadians(angulo));
            System.out.println("Cosseno de " + angulo + ": " + cosseno);

        }

    }
}
