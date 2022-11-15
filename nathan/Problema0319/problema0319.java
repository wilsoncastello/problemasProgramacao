package Problema0319;

import java.util.Scanner;

public class problema0319{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int n = Integer.valueOf(input.nextLine());

        int vA[] = new int[n];
        int vB[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o vetor na posição " + (i) + ": ");
            vA[i] = Integer.valueOf(input.nextLine());
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                vB[i] = vB[i] + vA[j];
            }
        }

        System.out.println("\nVETOR B");
        for (int i = 0; i < vB.length; i++) {
            System.out.print(vB[i] + " ");
        }
    }
}