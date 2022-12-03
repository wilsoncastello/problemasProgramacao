import java.util.Scanner;

public class problema0271 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int N;
        System.out.println("Digite a quantidade de números para o vetor:");
        N = Integer.valueOf(input.nextLine());
        int[] vetor = new int[N];
        for(int i=0;i<N;i++){
            System.out.println("Digite um número para a posição "+i+" do vetor:");
            vetor[i] = Integer.valueOf(input.nextLine());
        }
        System.out.println("Números múltiplos de 2:");
        for(int i=0;i<N;i++){
            if(vetor[i] % 2 == 0){
                System.out.println(vetor[i]);
            }
        }
        System.out.println("Números múltiplos de 3:");
        for(int i=0;i<N;i++){
            if(vetor[i] % 3 == 0){
                System.out.println(vetor[i]);
            }
        }
        System.out.println("Números multiplos de 2 e de 3:");
        for(int i=0;i<N;i++){
            if(vetor[i] % 2 == 0 && vetor[i] % 3 ==0){
                System.out.println(vetor[i]);
            }
        }
    }
}