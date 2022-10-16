//Faça um programa que leia um número inteiro de 4 casas e imprima se o algarismo que está nas casas das unidades de milhar é ou não múltiplo de quatro.

import java.util.Scanner;

public class Problema0116 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        int n, x;

        System.out.println("Digite um número inteiro de 4 digitos: ");
        n = Integer.valueOf(input.nextLine());

        x = n / 1000;

        if(x % 4 == 0){
            System.out.println("O número da unidade de milhar é multiplo de quatro");
        }

        else{
            System.out.println("O número da unidade de milhar não é multiplo de quatro");
        }

    }
}
