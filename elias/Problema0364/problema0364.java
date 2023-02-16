import java.util.Scanner;

public class problema0364 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[][] matriz = new int[5][4];
        int[] vetorSomaLinhas = new int[5];
        int[][] matrizResultante = new int[5][4];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite um número para a linha "+i+" e coluna "+j);
                matriz[i][j] = Integer.valueOf(input.nextLine());
            }
        }
        for (int i = 0; i < 5; i++) {
            int somaLinhas = 0;
            for (int j = 0; j < 4; j++) {
                somaLinhas = somaLinhas + matriz[i][j];
            }   
            vetorSomaLinhas[i] = somaLinhas;  
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                matrizResultante[i][j] = matriz[i][j] * vetorSomaLinhas[i];
            }
        }
        System.out.println("A matriz resultante é: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizResultante[i][j]+" ");  
            }
            System.out.println("");
        }
    }
}