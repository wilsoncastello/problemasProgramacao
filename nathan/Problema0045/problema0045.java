package Problema0045;

import java.util.Scanner;
public class problema0045{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double n = Double.valueOf(input.nextLine());
        double quadrado = n * n;
        double raiz = Math.sqrt(n);
        System.out.println("Numero: " + n);
        System.out.println("Quadrado do número: " + quadrado);
        System.out.println("Raíz do número: " + raiz);
    }
}
