package raphael.Problema0030;

import java.util.Scanner;

public class Problema0030 {

    /* João recebeu seu salário e precisa pagar duas contas atrasadas. Em razão do atraso, ele deverá pagar multa de 2% sobre cada conta. Faça um programa que leia o valor do salário e das duas contas, calcule e mostre quanto restará do salário de João (considere que o salário de João sempre será suficiente para pagar as contas).  */

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float salario, conta1, conta2, multa1, multa2, restoSalario;
        
        System.out.println("Digite o salário de João: ");
        salario = Float.valueOf(input.nextLine());
        
        System.out.println("Digite valor da primeira conta: ");
        conta1 = Float.valueOf(input.nextLine());
        
        System.out.println("Digite o valor da segunda conta: ");
        conta2 = Float.valueOf(input.nextLine());
        
        multa1 = conta1 / 50;
        multa2 = conta2 / 50;
        restoSalario = salario - conta1 - conta2 - multa1 - multa2;
        
        System.out.println("Restará "+restoSalario+" reais do salário de João.");

    }
    
}
