package Problema0361;

import java.util.Scanner;

public class problema0361 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int M[][] = new int[2][2];
        int R[][] = new int[2][2];
        int maiorN = Integer.MIN_VALUE;

        for (int l = 0; l < 2; l++) {
            for (int c = 0; c < 2; c++) {
                System.out.println("Digite o valor na posição ["+ l +"][" + c + "]: ");
                M[l][c] = Integer.valueOf(input.nextLine());
                if(M[l][c] > maiorN)
                    maiorN = M[l][c];
            }
        }
        for (int l = 0; l < 2; l++) {
            for (int c = 0; c < 2; c++) {
                R[l][c] = M[l][c] * maiorN;
            }
        }
        for (int l = 0; l < 2; l++) {
            for (int c = 0; c < 2; c++) {
                System.out.print(R[l][c] + " ");
            }
            System.out.println("");
        }
    }
}
