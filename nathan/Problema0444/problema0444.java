package Problema0444;

import java.util.Scanner;

public class problema0444 {

    static void verificaN(int x){
        if(x < 0)
            System.out.println("NEGATIVO");
        else
            System.out.println("POSITIVO");
    }
    public static void main(String[] args) {      
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero para saber se é positivo ou negativo: ");
        int n = Integer.valueOf(input.nextLine());
        verificaN(n);
    }
}
