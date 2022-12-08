package Problema0213;

import java.util.Scanner;

public class problema0213 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do salário minímo: ");
        double salMin = Double.valueOf(input.nextLine());

        double valorHoraTrabalhada = salMin / 10;
        double valorHoraExtra = valorHoraTrabalhada / 2;

        System.out.println("Digite o número de horas trabalhadas: ");
        int numHoras = Integer.valueOf(input.nextLine());
        while(numHoras != -1){
            System.out.println("Numero de dependentes: ");
            int numDependentes = Integer.valueOf(input.nextLine());
            System.out.println("Quantidade de horas extras trabalhadas: ");
            int quantHorasExtras = Integer.valueOf(input.nextLine());

            double salarioMes = numHoras * valorHoraTrabalhada;
            double salarioBruto = salarioMes + (valorHoraExtra * quantHorasExtras) + (300 * numDependentes);

            double salarioLiquido;

            if(salarioBruto <= 1800){
                salarioLiquido = salarioBruto;
            }else if(salarioBruto <= 5000){
                salarioLiquido = salarioBruto - (salarioBruto * 0.1);
            }else{
                salarioLiquido = salarioBruto - (salarioBruto * 0.2);                
            }

            double salarioFinal;

            if(salarioLiquido <= 2500){
                salarioFinal = salarioLiquido + 300;
            }else{
                salarioFinal = salarioLiquido + 100;
            }
            
            System.out.println("Salario Final do funcionário: " + salarioFinal);

            System.out.println("Digite o número de horas trabalhadas(-1 PARA FINALIZAR O PROGRAMA): ");
            numHoras = Integer.valueOf(input.nextLine());
        }
        System.out.println("Programa finalizado");
    }

}
