package Problema0243;

import java.util.Scanner;

public class problema0243{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int vA[] = new int[20];
        int vB[] = new int[20];
        int vC[] = new int[20];

        System.out.println("VETOR A");
        for(int i = 0; i < 20; i++){
            System.out.println("Digite o numero da posição " + (i+1) + ": ");
            vA[i] = Integer.valueOf(input.nextLine());
        }
        System.out.println("VETOR B");
        for(int i = 0; i < 20; i++){
            System.out.println("Digite o numero da posição " + (i+1) + ": ");
            vB[i] = Integer.valueOf(input.nextLine());
        }
        for(int i = 0; i < 20; i++){
            vC[i] = vA[i] - vB[i];
        }
        for(int i = 0; i < 20; i++){
            System.out.println(vC[i] + " ");
        }
    }
}