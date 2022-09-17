package Problema0092;

import java.util.Scanner;
public class problema0092 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do produto 1: ");
        String produto1 = input.nextLine();
        System.out.println("Digite a quantidade em estoque: ");
        int estoque1 = Integer.valueOf(input.nextLine());

        System.out.println("Digite o nome do produto 2: ");
        String produto2 = input.nextLine();
        System.out.println("Digite a quantidade em estoque: ");
        int estoque2 = Integer.valueOf(input.nextLine());

        System.out.println("Digite o nome do produto 3: ");
        String produto3 = input.nextLine();
        System.out.println("Digite a quantidade em estoque: ");
        int estoque3 = Integer.valueOf(input.nextLine());

        System.out.println("Digite o nome do produto 4: ");
        String produto4 = input.nextLine();
        System.out.println("Digite a quantidade em estoque: ");
        int estoque4 = Integer.valueOf(input.nextLine());

        System.out.println("Produtos que estão abaixo do estoque: ");
        if(estoque1 < 30)
            System.out.println(produto1);
        if(estoque2 < 30)
            System.out.println(produto2);
        if(estoque3 < 30)
            System.out.println(produto3); 
        if(estoque4 < 30)
            System.out.println(produto4);          
    }
}
