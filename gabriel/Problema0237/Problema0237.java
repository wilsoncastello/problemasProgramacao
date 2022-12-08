package Problema0237;

import java.util.Scanner;
class Problema0237{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma = 0, resto;
        
        System.out.println("Digite um numero inteiro positivo: ");
        int numero = Integer.valueOf(input.nextLine());
        
        while(numero > 0){
            resto = 0;
            resto = numero % 10;
            soma = soma + resto;
            numero = numero / 10;
            
        }
        
        System.out.println("Soma dos algarismos: "+soma);
   }
}
