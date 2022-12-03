import java.util.Arrays;
import java.util.Scanner;
public class problema0299 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Escreve n: ");
        int n = input.nextInt();
        System.out.println("Escreve m: ");
        int m = input.nextInt();

        int[] x = new int[n];
        int[] y = new int[m];

        for(int i = 0; i < x.length;i++){
            System.out.println("Escreve numero da colocar no vetor x: ");
            int b = input.nextInt();

            x[i] = b;

        }

        for(int i = 0; i < y.length;i++){
            System.out.println("Escreve numero da colocar no vetor y: ");
            int c = input.nextInt();

            y[i] = c;

        }


        int[] a = new int[n+m];
        for(int i = 0; i < a.length; i=i+2){
            if(i < x.length && i==0){
                a[i] = x[i];
                a[i+1] = y[i];
            }
            else if(i <= x.length && i>0){
                a[i] = x[i-1];
                a[i+1] = y[i-1];
            }
            else{
                a[i] = y[i-2];
            }
        }
        
        System.out.println("x: "+Arrays.toString(x));
        System.out.println("y: "+Arrays.toString(y));
        System.out.println("a: "+Arrays.toString(a));

    }
}