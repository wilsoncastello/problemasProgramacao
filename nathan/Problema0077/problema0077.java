package Problema0077;

import java.util.Scanner;
public class problema0077 {
    
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    double n1 = Double.valueOf(input.nextLine());
    System.out.println("Digite o segundo número: ");
    double n2 = Double.valueOf(input.nextLine());

    double soma = n1 + n2;
    double subtracao = n1 - n2;
    double multiplicacao = n1 * n2;
    double divisao = n1 / n2;

    System.out.println("Soma: " + soma);
    System.out.println("Subtração: " + subtracao);
    System.out.println("Multiplicação: " + multiplicacao);
    System.out.println("Divisão: " + divisao);
    }
}
