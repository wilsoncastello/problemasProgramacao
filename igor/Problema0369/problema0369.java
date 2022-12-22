import java.util.Scanner;



public class problema0369 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {


        int x[][] = new int [5][5];

        for(int i=0;i<x.length;i++){
            for(int j=0;j<x.length;j++){
                System.out.println(i+" "+j+": ");
                int y = input.nextInt();
                x[i][j] = y;
            }
        }

        int m = 0;

        for(int i=0;i<x.length;i++){
            for(int j=0;j<x.length;j++){
                m = Math.max(m, x[i][j]);
            }
        }

        int[] f = new int[m + 1];

        
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x.length;j++){
                f[x[i][j]]++;
                
            }
        }

        
        for (int i = 0; i < m + 1; i++){
            if (f[i] > 1) {
                System.out.println(i + ": "+f[i]);
            }
        }
    }
}