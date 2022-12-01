package Problema0382;

import java.util.Scanner;

public class problema0382 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int m[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Digite o vetor na posição [" + i + "][" + j + "] :");
                m[i][j] = Integer.valueOf(input.nextLine());
            }
        }
        System.out.println("Numeros que estão abaixo da diagonal principal: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i > j){
                    System.out.print(m[i][j]);
                }
            }
        }
    }
}
