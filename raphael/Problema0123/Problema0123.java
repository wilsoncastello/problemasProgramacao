package raphael.Problema0123;

import java.util.Scanner;

public class Problema0123 {
    
/*"Crie um algoritmo que leia a idade de uma pessoa e informe sua classe eleitoral:
* não-eleitor (abaixo de 16 anos)
* eleitor obrigatório (entre 18 e 65 anos)
* eleitor facultativo (entre 16 e 18 anos e maior de 65 anos) " */

    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in);

        int idade;
        System.out.println("Digite a idade de uma pessoa: ");
        idade = Integer.valueOf(input.nextLine());

        if (idade < 16) {
            System.out.println("classe eleitoral: não eleitor");
        }
        else {
            if (idade > 17 && idade < 66) {
                System.out.println("classe eleitoral: eleitor obrigatório");
            }
            else {
                System.out.println("classe eleitoral: eleitor facultativo");
            }
        }

    }

}
