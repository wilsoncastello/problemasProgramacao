//Faça um programa que receba o salário de um funcionário e o percentual de aumento, calcule e mostre o valor do aumento e o novo salário.

import java.util.Scanner;

public class Problema0007 {

    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);

   

    float salario, aumento, valorAumento, salarioNovo;

    //entradas

        System.out.println("Digite o valor do salário do funcionário");
        salario = Float.valueOf(input.nextLine());

         System.out.println("Digite a porcentagem de aumento do salário do funcionário");
        aumento = Float.valueOf(input.nextLine());

    //cálculos

        valorAumento = salario * aumento / 100;
        salarioNovo = salario + valorAumento;

    //saídas

        System.out.println("Valor do aumento do salário: " +valorAumento);
        System.out.println("Valor do novo salário: " +salarioNovo);

    }
}
