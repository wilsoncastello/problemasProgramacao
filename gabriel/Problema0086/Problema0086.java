//Elabore um algoritmo que tome como entrada o número do mês (1 a 12) e o respectivo valor do ano e determine o número de dias desse mês. Veja que um mês apresenta 30 ou 31 dias, exceto o mês de fevereiro que tem 28 dias. Entretanto, fevereiro tem 29 dias caso o ano seja bissexto. Um ano é bissexto se for múltiplo de 4.

package Problema0086;

import java.util.Scanner;

public class Problema0086 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int mes, ano;

    System.out.println("Digite o número do mês desejado");
    mes = Integer.valueOf(input.nextLine());

    System.out.println("Digite o ano em questão");
    ano = Integer.valueOf(input.nextLine());
    
    if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes ==12){
      System.out.println("Esse mês tem 31 dias");
    }
     
    else if(mes == 2){
        if(ano % 4 == 0){
            System.out.println("Esse mês tem 29 dias");
        }
        else{
            System.out.println("Esse mês tem 28 dias");
        }
    }

    else{
        System.out.println("Esse mes tem 30 dias");
    }


    }
}
