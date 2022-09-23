import java.util.Scanner;

public class problema0083{

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    int A, B;
    System.out.print("Digite o primeiro número:");
    A = Integer.valueOf(input.nextLine());
    System.out.print("Digite o segundo número:");
    B = Integer.valueOf(input.nextLine());
    if(A>B){
        System.out.println("O maior número é: "+A);
    }
    else
        System.out.println("O maior número é: "+B); 
    }
}