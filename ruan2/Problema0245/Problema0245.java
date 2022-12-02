import java.util.Scanner;

public class Problema0245{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetA = new int[15];
        int[] vetB = new int[15];

        for(int i = 0; i < 15; i++){
            System.out.print("Digite um numero para o vetor A, na posição "+i+": ");
            vetA[i] = Integer.valueOf(input.nextLine());

            int fat = 1;
            for(int j = 1; j<=vetA[i]; j++){
                fat = fat * j;
            }

            vetB[i] = fat;
        }

        System.out.println("Vetor A                Vetor B");
        for(int i = 0; i<15; i++){
            System.out.println("  "+vetA[i]+"        -->         "+vetB[i]);
        }
    }
}