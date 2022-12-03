package Problema0396;

import java.util.Scanner;

public class problema0396 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ingTortas[][] = new int[6][3];

        for (int i = 0; i < 6; i++) {
            System.out.println("\nTorta " + (i+1) + ": ");
            for (int j = 0; j < 3; j++) {
                if(j == 0){
                    System.out.println("Quantidade de xícaras de farinha de trigo: ");
                    ingTortas[i][j] = Integer.valueOf(input.nextLine());
                }else if(j == 1){
                    System.out.println("Quantidade de xícaras de açucar: ");
                    ingTortas[i][j] = Integer.valueOf(input.nextLine());
                }else{
                    System.out.println("Quantidade de xícaras de leite: ");
                    ingTortas[i][j] = Integer.valueOf(input.nextLine());
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            int quantTortas = 1;
            System.out.println("\n Quantidade feitas da tortas " + (i+1) + ": ");
            quantTortas = Integer.valueOf(input.nextLine());
            for (int j = 0; j < 3; j++){
                ingTortas[i][j] = ingTortas[i][j] * quantTortas;
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 3; j++){
                System.out.print(ingTortas[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
