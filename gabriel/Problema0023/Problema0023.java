//Faça um programa que receba dois números, calcule e mostre a subtração do primeiro número pelo segundo. 

package Problema0023;

import java.util.Scanner;

public class Problema0023 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
         int n1, n2, subtracao;
     
         //entrada
         System.out.println("Digite um número");
         n1 = Integer.valueOf(input.nextLine());
        
         System.out.println("Digite outro número");
         n2 = Integer.valueOf(input.nextLine());
     
         //cálculo
        subtracao = n1 - n2;
     
         //saída 
         System.out.println("Subtração de n1 por n2: "+subtracao);
         
       }
}
