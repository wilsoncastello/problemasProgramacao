import java.util.Scanner;

public class problema0314 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int N;
        int numero;
        int quantidadeNumerosIguais = 0;
        System.out.println("Digite a quantidade de números do vetor: ");
        N = Integer.valueOf(input.nextLine());
        int[] X = new int[N];
        for(int i=0;i<N;i++){
            System.out.println("Digite um número inteiro para a posição "+i+" do vetor: ");
            X[i] = Integer.valueOf(input.nextLine());   
        }
        for(int i=0;i<N;i++){
            numero = X[i];
            if(numero == X[i]){
                quantidadeNumerosIguais++;
            }
        }
        System.out.println("O número "+numero+" apareceu "+quantidadeNumerosIguais+" vezes.");
    }
}