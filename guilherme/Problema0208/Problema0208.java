import java.util.Scanner;
<<<<<<< HEAD
=======
import java.lang.Math;
>>>>>>> 542291d04ac0dedbaeac1d2b263179c7fcdf0afc

public class Problema0208{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
<<<<<<< HEAD
        double sen=0, fat = 1;
        int sinal = 1; 
        System.out.println("Digite um número em graus: ");
        double x = Double.valueOf(input.nextLine());
        double y = x * 3.141592 / 180;
        for(int i = 1; i < 10; i += 2){ 
=======
        double sen = 0, x, y;
        int fat = 1, sinal = 1;
        System.out.println("Digite um número em graus: ");
        x = Integer.valueOf(input.nextLine());

        y = x * 3.141592 / 180;
        for(int i = 1; i < 20; i++){
>>>>>>> 542291d04ac0dedbaeac1d2b263179c7fcdf0afc
            fat = 1;
            for(int j = 1; j < i + 1; j++)
                fat *= j;
            sen += Math.pow(y, i) / fat * (sinal);
            sinal = sinal * (-1);
<<<<<<< HEAD
        }
        System.out.println("O seno de " + x + " é " + sen);
=======
            i++;
        }
        System.out.println("O seno de " + x + " é: " + sen);
>>>>>>> 542291d04ac0dedbaeac1d2b263179c7fcdf0afc
    }
}