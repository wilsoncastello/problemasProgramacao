package Problema0326;

import java.util.Scanner;

public class problema0326 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um nome: ");
        String nome = input.nextLine();

        while(!nome.equalsIgnoreCase("FIM")){
            System.out.println(nome.charAt(0));

            System.out.println("\nDigite um nome: ");
            nome = input.nextLine();
        }
    }
}
