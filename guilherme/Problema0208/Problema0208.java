import java.util.Scanner;
import java.lang.Math;

public class Problema0208{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        double sen = 0, x, y;
        int fat = 1, sinal = 1;
        System.out.println("Digite um número em graus: ");
        x = Integer.valueOf(input.nextLine());

        y = x * 3.141592 / 180;
        for(int i = 1; i < 20; i++){
            fat = 1;
            for(int j = 1; j < i + 1; j++)
                fat *= j;
            sen += Math.pow(y, i) / fat * (sinal);
            sinal = sinal * (-1);
            i++;
        }
        System.out.println("O seno de " + x + " é: " + sen);
    }
}