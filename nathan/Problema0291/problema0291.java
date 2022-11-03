package Problema0291;

import java.util.Scanner;

public class problema0291 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vA[] = new int[25];
        int vB[] = new int[25];
        int vC[] = new int[50];

        System.out.println("Vetor A");
        for (int i = 0; i < vA.length; i++) {
            System.out.println("Digite o numero na posição " + i + ": ");
            vA[i] = Integer.valueOf(input.nextLine());
        }
        System.out.println("Vetor B");
        for (int i = 0; i < vA.length; i++) {
            System.out.println("Digite o numero na posição " + i + ": ");
            vB[i] = Integer.valueOf(input.nextLine());
        }

        int j = 0, k = 0;
        for (int i = 0; i < vC.length; i++) {
            if (i % 2 == 0) {
                vC[i] = vA[j];
                j++;
            } else {
                vC[i] = vB[k];
                k++;
            }
        }
        for (int l = 0; l < vC.length; l++) {
            System.out.println(vC[l] + " ");
        }
    }
}
