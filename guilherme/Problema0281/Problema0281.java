import java.util.Scanner;
public class Problema0281{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        float[] vetor = new float[10];
        float maior = 0;
        System.out.println("Digite 10 números inteiros: ");
        for(int i = 0; i < 10; i++){
            vetor[i] = Integer.valueOf(input.nextLine());
            if(vetor[i] > maior)
                maior = vetor[i];
        }
        System.out.println("\nVetor após os cálculos: ");
        for(int i = 0; i < 10; i++){
            vetor[i] /= maior;
            System.out.println(vetor[i]);
        }
    }
}