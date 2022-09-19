package raphael.Problema0093;

import java.util.Scanner;

/*Considerando as faixas especificadas a seguir, escreva um algoritmo que, para um determinado valor inteiro, imprima qual a faixa que o mesmo pertence. Faixa A - Valores abaixo de 100; Faixa B - Valores de 100 a 150 (inclusive extremos); Faixa C - Valores de 151 a 300 (inclusive extremos); Faixa X - Quaisquer outros valores. */

public class Problema0093 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        int valor;

        System.out.println("Digite o valor inteiro: ");
        valor = Integer.valueOf(input.nextLine());

        if (valor < 100) {
            System.out.println("O valor pertence a Faixa A");
        }
        else {
            if (valor > 99 && valor < 151) {
                System.out.println("O valor pertence a Faixa B");
            }
            else {
                if (valor > 150 && valor < 301) {
                    System.out.println("O valor pertence a Faixa C");
                }
                else {
                    System.out.println("O valor pertence a Faixa X");
                }
            }
        }

    }

}



