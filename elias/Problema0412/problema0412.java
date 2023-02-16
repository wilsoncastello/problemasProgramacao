import java.util.Scanner;

public class problema0412 {

    public static int[] ordenarVetor(int[] A){
        int auxiliar;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(A[i] < A[j]){
                    auxiliar = A[i];
                    A[i] = A[j];
                    A[j] = auxiliar;
                }
            }
        }
        return A;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] A = new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Digite um número para a posição "+i+" do vetor:");
            A[i] = Integer.valueOf(input.nextLine());
        }
        int[] vetorOrdenado = ordenarVetor(A);
        System.out.println("O vetor ordenado de forma crescente é:");
        for(int i=0;i<5;i++){
            System.out.print(vetorOrdenado[i]+" ");
        }
    }
}