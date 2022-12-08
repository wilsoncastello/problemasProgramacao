package Problema0347;

import java.util.Scanner;

public class problema0347{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um verbo regular que termina com 'ar' para ver suas conjugações: ");
        String verbo = input.nextLine();

        System.out.println("Verbo: " + verbo);
        System.out.println("Eu " + verbo.substring(0, verbo.length()-2) + "o");
        System.out.println("Tu " + verbo.substring(0, verbo.length()-2) + "as");
        System.out.println("Ele " + verbo.substring(0, verbo.length()-2) + "a");
        System.out.println("Ela " + verbo.substring(0, verbo.length()-2) + "a");
        System.out.println("Nós " + verbo.substring(0, verbo.length()-2) + "amos");
        System.out.println("Vós " + verbo.substring(0, verbo.length()-2) + "ais");
        System.out.println("Elas " + verbo.substring(0, verbo.length()-2) + "am");
    }
}