import java.util.Scanner;

public class problema0307 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float[] A = new float[10];
        float[] B = new float[10];
        for(int i=0;i<10;i++){
            System.out.print("Digite a temperatura em Graus Celsius para a posição "+i+" do vetor:");
            A[i] = Float.valueOf(input.nextLine());
        }
        for(int i=0;i<10;i++){
            B[i] = A[i] * 9 / 5 + 32;
        }
        for(int i=0;i<10;i++){
            System.out.println("Temperatura em Graus Celsius: "+A[i]+"   Temperatura em Graus Fahrenheit: "+B[i]);
        }
    }
}