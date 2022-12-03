package Problema0424;

import java.util.Scanner;

public class problema0424{

    static int calculaFat(int x){
        int y = 1;
        for (int i = x; i > 0; i--) {
            y = y * i;
        }
        return y;
    }

    static int[] formarV(int n){
        Scanner input = new Scanner(System.in);
        int v[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o valor na posição " + i + ": ");
            int z = Integer.valueOf(input.nextLine());
            v[i] = calculaFat(z);
        }
        return v;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int n = Integer.valueOf(input.nextLine());

        int v[] = new int[n];
        v = formarV(n);
        for (int i = 0; i < v.length; i++) {
            System.out.println(v[i] + " ");
        }
    }
}