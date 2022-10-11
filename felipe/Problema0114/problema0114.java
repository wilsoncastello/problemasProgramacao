import java.util.Scanner;

public class problema0114{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Digite um numero: ");
        num = Integer.parseInt(input.nextLine());

        if( num % 3 == 0 && num % 7 == 0 ){
           System.out.println("Esse número é divisível por 3 e por 7.");
        } else {
            System.out.println("Esse número não é divisível por 3 e 7.");
        } 
    }
}