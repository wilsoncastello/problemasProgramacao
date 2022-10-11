import java.util.Scanner;

public class problema0219 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numerador1, numerador2, denominador1, denominador2;      
        System.out.println("Digite o numerador da primeira fração:");
        numerador1 = Integer.valueOf(input.nextLine());
        System.out.println("Digite o denominador da primeira fração:");
        denominador1 = Integer.valueOf(input.nextLine());
        System.out.println("Digite o numerador da segunda fração:");
        numerador2 = Integer.valueOf(input.nextLine());
        System.out.println("Digite o denominador da segunda fração:");
        denominador2 = Integer.valueOf(input.nextLine());
    }
}