import java.util.Scanner;

public class problema0279 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        for(int i=0;i<10;i++){
            System.out.print("Digite um número inteiro para a posição "+i+" do vetor: ");
            vetor1[i] = Integer.valueOf(input.nextLine());
        }
        for(int i=0;i<10;i++){
            if(vetor1[i] < 0){
                vetor2[i] = 0;
            }
            else
                vetor2[i] = vetor1[i];
        }
        System.out.println("Vetor 1:");
        for(int i=0;i<10;i++){
            System.out.println(vetor1[i]);
        }
        System.out.println(" ");
        System.out.println("Vetor 2:");
        for(int i=0;i<10;i++){
            System.out.println(vetor2[i]);
        }
    }
}