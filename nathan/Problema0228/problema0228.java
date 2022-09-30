package Problema0228;

import java.util.Scanner;

public class problema0228 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int contPessoa300Comida = 0;
        double somaMedia300Comida = 0, somaAluguel = 0, percAlimentacao, percVestimenta;

        for(int i = 0; i < 3; i++){
            System.out.println("Pessoa " + (i+1) + "\nDigite a renda mensal da família: ");
            double rendaFamilia = Double.valueOf(input.nextLine());
            System.out.println("Gasto com alimentação: ");
            double gastoAlimentacao = Double.valueOf(input.nextLine());
            System.out.println("Gasto com vestimenta: ");
            double gastoVestimenta = Double.valueOf(input.nextLine());
            System.out.println("Gasto com aluguel: ");
            double gastoAluguel = Double.valueOf(input.nextLine());

            if(gastoAlimentacao > 300){
                contPessoa300Comida++;
                somaMedia300Comida = somaMedia300Comida + gastoAlimentacao;
            }
            somaAluguel = somaAluguel + gastoAluguel;
            percAlimentacao = (gastoAlimentacao * 100) / rendaFamilia;
            percVestimenta = (gastoVestimenta * 100)/ rendaFamilia;

            System.out.println("");
            System.out.println("Aluno " + (i+1) + ":");
            System.out.println("Proporção de gastos com alimentação em relação a renda " + percAlimentacao + "%");
            System.out.println("Proporção de gastos com vestimenta em relação a renda " + percVestimenta + "%");
        }
        System.out.println("");
        System.out.println("Renda média familiar dos alunos que gastam acima de R$ 300,00 com alimentação: " + somaMedia300Comida / contPessoa300Comida);
        System.out.println("Gasto médio com aluguel: " + somaAluguel / 3);
    }
}
