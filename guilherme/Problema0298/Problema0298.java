import java.util.Scanner;

public class Problema0298{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int x = 1, maior = 0;
        System.out.println("Digite uma sequência de 10 números");
        for(int i = 0; i < 10; i++){
            vetor[i] = Integer.valueOf(input.nextLine());
            if(i == 0 || (i > 0 && vetor[i] < vetor[i-1]))
                x = 1;
            else if(i > 0 && vetor[i] > vetor[i-1])
                x++;
            if(x > maior)
            maior = x;
        }
        System.out.println("Maior Sequência: "+maior);
        
    }
}