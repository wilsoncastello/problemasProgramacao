package raphael.Problema0078;

import java.util.Scanner;

public class Problema0078 {

    /* Elaborar um programa que leia uma medida em pés e apresente o seu valor convertido em metros, lembrando que um pé mede 0,3048 metro, ou seja, um pé é igual a 30,48 centímetros. */

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        double pes, metros;
        
        System.out.println("Digite a medida em pés: ");
        pes = Double.valueOf(input.nextLine());
        
        metros = pes * 0.3048;
        
        System.out.println(pes+" pés equivalem a "+metros+" metros");

    }
    
}
