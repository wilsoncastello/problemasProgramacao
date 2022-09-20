package raphael.Problema0138;

import java.util.Scanner;

import javax.swing.SortingFocusTraversalPolicy;

public class Problema0138 {
    
    /*Elaborar um programa que leia um valor inteiro qualquer e apresente esse valor somente se for divisível por 2 ou somente se for divisível 3. Caso contrário, não faça nada. Esse valor pode ser apresentado caso seja divisível por 2 e 3. */

    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in);

        int valor;

        System.out.println("Digite um valor inteiro qualquer: ");
        valor = Integer.valueOf(input.nextLine());

        if (valor % 3 == 0) {
            System.out.println(valor);
        }
        else {
            if (valor % 2 == 0) {
                System.out.println(valor);
            }
        }


    }

}
