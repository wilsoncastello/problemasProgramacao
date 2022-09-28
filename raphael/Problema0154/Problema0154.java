package raphael.Problema0154;

import java.util.Scanner;

public class Problema0154 {
    
    /* Uma agência bancária possui dois tipos de investimentos, conforme o quadro a seguir. Faça um programa que receba o tipo de investimento e seu valor, calcule e mostre o valor corrigido após um mês de investimento, de acordo com o tipo de investimento. */

    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in);

        int tipo;
        float valor, valorCorrigido=0;

        System.out.println("Escolha sua opção de investimento e o valor conforme a tabela a seguir: \n \n TIPO        DESCRIÇÃO             RENDIMENTO \n  1          Poupança                  3% \n  2          Fundos de renda fixa      4% \n tipo: ");
        tipo = Integer.valueOf(input.nextLine());
        System.out.println("valor: ");
        valor = Float.valueOf(input.nextLine());

        if (tipo == 1) {
            valorCorrigido = valor + ((valor / 100) * 3);
        }
        else {
            if (tipo == 2) {
                valorCorrigido = valor + ((valor / 100) * 4);
            }
        }

        System.out.println("O valor corrigido após um mês de aplicação é "+valorCorrigido);

    }

}
