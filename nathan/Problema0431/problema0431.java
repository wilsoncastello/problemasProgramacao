package Problema0431;

import java.util.Scanner;

public class problema0431 {

    static void inverterV(int v[], int n){
        int j = v.length-1, aux = 0;
        for (int i = 0; i < n/2; i++) {
            aux = v[i];
            v[i] = v[j];
            v[j] = aux;
            j--;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int n = Integer.valueOf(input.nextLine());

        int v[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o valor na posição " + (i) +": ");
            v[i] = Integer.valueOf(input.nextLine());
        }

        inverterV(v, n);
        for (int i = 0; i < n; i++) {
            System.out.print(v[i]);
        }
    }
}
