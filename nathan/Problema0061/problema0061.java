package Problema0061;

import java.util.Scanner;
public class problema0061 {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    
    System.out.println("Digite o valor da abcissa: ");
    int abcissa = Integer.valueOf(input.nextLine());
    System.out.println("Digite o valor da ordenada: ");
    int ordenada = Integer.valueOf(input.nextLine());

    boolean quadrante2;

    if(abcissa < 0 && ordenada > 0)
        quadrante2 = true;
    else
        quadrante2 = false;

    System.out.println("O ponto esta no quadrante 2? " + quadrante2);
    }
}
