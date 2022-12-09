package Problema0409;

import java.util.Scanner;

public class problema0409 {

    static int soma(int x, int y){
        return x + y;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int n1 = Integer.valueOf(input.nextLine());

        System.out.println("Digite o segundo número: ");
        int n2 = Integer.valueOf(input.nextLine());

        System.out.println(soma(n1, n2));
    }
}
