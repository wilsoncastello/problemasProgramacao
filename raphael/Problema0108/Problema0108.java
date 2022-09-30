package raphael.Problema0108;

import java.util.Scanner;

public class Problema0108 {
    
/*Faça um programa que receba a idade de uma pessoa e mostre a mensagem de maioridade (igual ou superior a 18 anos) ou não. */

    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in);

        int idade;

        System.out.println("Digite a idade de uma pessoa: ");
        idade = Integer.valueOf(input.nextLine());

        if (idade < 18) {
            System.out.println("A pessoa não é maior de idade");
        }
        else {
            System.out.println("A pessoa é maior de idade");
        }

    }

}
