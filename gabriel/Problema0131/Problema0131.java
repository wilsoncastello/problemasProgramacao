//"Crie um algoritmo que informe a quantidade total de calorias de uma refeição a partir da escolha do usuário 'que deverá informar o prato, a sobremesa e bebida
//(veja a tabela a seguir).

//PRATO                                 SOBREMESA                                     BEBIDA
//Vegetariano 180cal               Abacaxi 75cal                                   Chá 20cal
//Peixe 230cal                     Sorvete diet 11Ocal                             Suco de laranja 70cal
//Frango 250cal                    Mousse diet 1 7Ocal                             Suco de melão 1 OOcal
//Carne 350cal                     Mousse chocolate 200cal                         Refrigerante diet 65cal"


import java.util.Scanner;

public class Problema0131 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System .in);

        String prato, sobremesa, bebida;

        System.out.println("Digite o prato escolhido (Vegetariano, peixe, frango ou carne): ");
        prato = input.nextLine();

        System.out.println("Digite a sobremesa escolhida (Abacaxi, sorvete diet, mousse diet ou mousse chocolate): ");
        sobremesa = input.nextLine();

        System.out.println("Digite a bebida escolhida (Chá, suco de laranja, suco de melão, refrigerante diet): ");
        bebida = input.nextLine();

        int caloriaPrato, caloriaSobremesa, caloriaBebida, caloriaTotal;

        //prato
        if(prato.equalsIgnoreCase("vegetariano")){
            caloriaPrato = 180;
        }

        else if(prato.equalsIgnoreCase("peixe")){
            caloriaPrato = 230;
        }

        else if(prato.equalsIgnoreCase("frango")){
            caloriaPrato = 250;
        }

        else {
            caloriaPrato = 350;
        }

        //sobremesa
        if(sobremesa.equalsIgnoreCase("Abacaxi")){
            caloriaSobremesa = 75;
        }

        else if(sobremesa.equalsIgnoreCase("Sorvete diet")){
            caloriaSobremesa = 110;
        }

        else if(sobremesa.equalsIgnoreCase("Mousse diet")){
            caloriaSobremesa = 170;
        }

        else{
            caloriaSobremesa = 200;
        }

        //bebida
        if(bebida.equalsIgnoreCase("Refrigerante diet")){
            caloriaBebida = 65;
        }

        else if(bebida.equalsIgnoreCase("Suco de laranja")){
            caloriaBebida = 70;
        }

        else if(bebida.equalsIgnoreCase("Suco de melão")){
            caloriaBebida = 100;
        }
         
        else{
            caloriaBebida = 20;
        }


        caloriaTotal = caloriaPrato + caloriaSobremesa + caloriaBebida;

        System.out.println("Total de calorias consumidas na refeição escolhida: " + caloriaTotal);

        





    }
}