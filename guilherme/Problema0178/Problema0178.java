import java.util.Scanner;
public class Problema0178{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int x;
        for(int i = 1; i <= 5; i++){
            System.out.println("Digite o " + i + " número: ");
            x = Integer.valueOf(input.nextLine());
            x *= x;
            System.out.println("O quadrado é " + x);
        }
    }
}