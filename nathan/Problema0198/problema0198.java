package Problema0198;

import java.util.Scanner;

public class problema0198 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("SEQUÊNCIA DE RICCI");
        System.out.println("Digite o primeiro número: ");
        int n1 = Integer.valueOf(input.nextLine());
        System.out.println("Digite o segundo número: ");
        int n2 = Integer.valueOf(input.nextLine());
        System.out.println("------------------------");

        System.out.println(n1);
        System.out.println(n2);
        for(int i = 0; i < 5; i++){
            int n3 = n2 + n1;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}