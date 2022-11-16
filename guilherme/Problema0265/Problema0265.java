import java.util.Scanner;

public class Problema0265{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int x, j = 19;
        int[] a = new int[20];
        int[] b = new int[20];
        for(int i = 0; i < 20; i++){
            System.out.println("Digite o numero " + i + " do vetor A: ");
            a[i] = Integer.valueOf(input.nextLine());
        }
        System.out.println("Vetor A:");
        for(int i = 0; i < 20; i++)
            System.out.print(a[i] + " ");
        for(int i = 0; i < 20; i++){
             x = a[i];
             a[i] = b[j];
             b[j] = x;
             j--;             
        }
        System.out.println("\nVetor B:");
        for(int i = 0; i < 20; i++)
            System.out.print(b[i] + " "); 
    }
}