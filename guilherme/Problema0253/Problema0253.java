import java.util.Scanner;

public class Problema0253{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int j = 0, k = 0;
        int[] vetor = new int[8];
        int[] vetorPositivo = new int[8];
        int[] vetorNegativo = new int[8];
        for(int i = 0; i < 8; i++){
            System.out.println("Digite um número inteiro: ");
            vetor[i] = Integer.valueOf(input.nextLine());
            if(vetor[i] >= 0){
                vetorPositivo[j] = vetor[i];
                j++;
            }else{
                vetorNegativo[k] = vetor[i];
                k++;
            }
        }
        
        System.out.println("Números do vetor positivo:");
        for(int i = 0; i < 8; i++)
            System.out.println(vetorPositivo[i]);
        
        System.out.println("Números do vetor negativo:");
        for(int i = 0; i < 8; i++)
            System.out.println(vetorNegativo[i]);
        
    }
}