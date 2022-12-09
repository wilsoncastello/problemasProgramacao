import java.util.Scanner;

public class Problema0440 {
    public static double funcao(double[] x, int i, int z) {

        if (z == 1) {
            return i;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         * Seja X um vetor com N elementos inteiros. Escreva uma função que forneça como
         * resultado
         * a posição do primeiro valor negativo do arranjo X. Caso X não contenha nenhum
         * negativo, a função deve fornecer
         * como resultado o valor -1. Em seguida, crie um programa que leias os dados
         * necessários, chame a função e apresente o
         * valor retornado por ela.
         */
        int z = 0;
        int h = 0;
        int a = 0;

        System.out.println("Digite o tamanho do vetor x: ");
        int n = Integer.valueOf(input.nextLine());
        double[] x = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite o valor na posicao " + i + ": ");
            x[i] = Double.valueOf(input.nextLine());
            if (x[i] < 0 && z == 0) {
                funcao(x, i, z);
                z = 1;
                h = i;

            }

        }
        for (int j = 0; j < n; j++) {
            if (z == 0) {
                funcao(x, j, z);
                a = j;
            }
        }
        if (z == 1) {
            System.out.println(funcao(x, h, z));
        } else {
            System.out.println(funcao(x, a, z));
        }
    }

}
