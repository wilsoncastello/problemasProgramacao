import java.util.Scanner;

public class problema0399 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int[][] C = new int[3][6];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Digite um número para a linha "+i+" e coluna "+j+" da matriz A: ");
                A[i][j] = Integer.valueOf(input.nextLine());   
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Digite um número para a linha "+i+" e coluna "+j+" da matriz B: ");
                B[i][j] = Integer.valueOf(input.nextLine());   
            }
        }
        for(int i=0;i<3;i++){
            int k=0;
            for(int j=0;j<3;j++){
                C[i][k] = A[i][j];
                k++;
                C[i][k] = B[i][j];
                k++;
            }
        }
        System.out.println("A matriz C é: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(C[i][j]+" ");  
            }
            System.out.println("");
        }
    }
}