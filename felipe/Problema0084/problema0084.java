import java.util.Scanner;

public class problema0084 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a,b,c;

        System.out.print("Digite A: ");
        a = Integer.parseInt(input.nextLine());

        System.out.print("Digite B: ");
        b = Integer.parseInt(input.nextLine());

        System.out.print("Digite C: ");
        c = Integer.parseInt(input.nextLine());

        if( (a > b) && (a > c) ) {

            System.out.print("'A' é o maior número.");

        } else {

            if( (b > a) && (b > c) ) {

                System.out.print("'B' é o maior número.");

            } else {

                System.out.print("'C' é o maior número.");

            }
        }
    }
}