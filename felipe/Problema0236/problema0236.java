import java.util.Scanner;

public class problema0236{
    public static void main(String[] args) {
        double a = 0;
        int numerador = -1, denominador = 0;

        for (int i = 1; i <= 25; i++){
            numerador = numerador + 2;
            denominador = i;
        }
        a = a + ((double)numerador/denominador);

        System.out.print("A = 49/25 = " + a);

    }
}