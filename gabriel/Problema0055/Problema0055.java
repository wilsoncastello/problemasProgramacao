//Faça um programa que leia dois numeros reais e imprima o quadrado da diferença do primeiro valor pelo segundo e a diferença dos quadrados.

package Problema0055;

import java.util.Scanner;

public class Problema0055 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        float n1, n2, QuadradoDiferenca, DiferencaQuadrados;
    
        // entrada
        System.out.println("Digite um numero real: ");
        n1 = Float.valueOf(input.nextLine());
    
        System.out.println("Digite outro numero real: ");
        n2 = Float.valueOf(input.nextLine());
    
        // cálculo
        QuadradoDiferenca = (n1 - n2) * (n1 - n2);
        DiferencaQuadrados = (n1 * n1) - (n2 * n2);
    
        System.out.println("O quadrado da diferença de n1 para n2: " + QuadradoDiferenca);
        System.out.println("A diferença do quadrado de n1 para o quadrado de n2: " + DiferencaQuadrados);
    
      }
}
