import java.util.Scanner;

public class problema0249 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        for(int i=0;i<10;i++){
            System.out.print("Digite um número inteiro para a posição "+i+" do vetor: ");
            A[i] = Integer.valueOf(input.nextLine());
        }
        for(int i=0;i<10;i++){
            int somatorio = 0;
            for(int j=1;j<=A[i];j++){
                somatorio += j;
                B[i] = somatorio;
            }
        }
        System.out.println("Vetor B:");
        for(int i=0;i<10;i++){
            System.out.println(B[i]);
        }
    }
}