package raphael.Problema0014;

import java.util.Scanner;

public class Problema0014{

    /* "Faça um programa que receba o número de horas trabalhadas e o valor do salário mínimo, calcule e mostre o salário a receber, seguindo estas regras:
    a) a hora trabalhada vale a metade do salário mínimo. 
    b) o salário bruto equivale ao número de horas trabalhadas multiplicado pelo valor da hora trabalhada. 
    c) o imposto equivale a 3% do salário bruto. 
    d) o salário a receber equivale ao salário bruto menos o imposto. " */

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        float horasTrabalhadas, salarioMinimo, receber, horaTrabalhada, bruto, imposto;
        
        System.out.println("Digite o numero de horas trabalhadas: ");
        horasTrabalhadas = Float.valueOf(input.nextLine());
        
        System.out.println("Digite o valor do salário minimo: ");
        salarioMinimo = Float.valueOf(input.nextLine());
        
        horaTrabalhada = salarioMinimo / 2;
        bruto = horasTrabalhadas * horaTrabalhada;
        imposto = (bruto * 3) / 100;
        receber = bruto - imposto;
        
        System.out.println("O salario a receber é de: "+receber+" reais.");

    }

}