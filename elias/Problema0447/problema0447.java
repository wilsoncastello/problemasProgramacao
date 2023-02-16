import java.util.Scanner;

public class problema0447 {

    public static int[] ordenaVetor(int[] A){
        int quantidadeNumerosMaiores0 = 0;
        for(int i=0;i<10;i++){
            if(A[i] > 0){
                quantidadeNumerosMaiores0++;
            }
        }  
        int[] B = new int[quantidadeNumerosMaiores0];
        int j=0;
        for(int i=0;i<10;i++){
            if(A[i] > 0){
                B[j] = A[i];
                j++;
            }
        }
        return B;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] A = new int[10];
        int quantidadeNumerosMaiores0 = 0;
        for(int i=0;i<10;i++){
            System.out.println("Digite um número para a posição "+i+" do vetor: ");
            A[i] = Integer.valueOf(input.nextLine());
            if(A[i] > 0){
                quantidadeNumerosMaiores0++;
            }
        }
        int[] B = ordenaVetor(A);
        System.out.println("O vetor B é:");
        for(int i=0;i<quantidadeNumerosMaiores0;i++){
            System.out.println(B[i]);
        }
    }
}