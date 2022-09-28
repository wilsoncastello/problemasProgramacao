import java.util.Scanner;
public class Problema0163{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        for(int j = 1; j <= 10; j++){
            System.out.println("\nTabuada do " + j);
            for(int i = 1; i <= 10; i++){
                int x = j * i;
                System.out.println(j + " x " + i + " = " + x);
            }
        }
    }
}