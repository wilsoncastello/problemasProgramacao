package Problema0222;

import java.util.Scanner;
public class Problema0222 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero inteiro positivo: ");
        int numero = Integer.valueOf(input.nextLine());
        boolean primo = true;
        
        for(int i=2; i<numero; i++){
            if(numero % i == 0){
                primo = false;
                System.out.println("o número "+numero+ " não é primo");
            }
        }
        if(primo == true){
            System.out.println("O numero "+numero+ " é primo");
        }
   }
}

