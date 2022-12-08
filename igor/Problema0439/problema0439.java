import java.util.Scanner;


public class problema0439 {

    static Scanner input = new Scanner(System.in);

    static void max(int[] x){
        int pos = 0;
        int valorMax = 0;
        for(int  i= 0; i < x.length; i++ ){
            if(x[i]>= valorMax){
                valorMax = x[i];
                pos= i;
            }
        }
        System.out.println("Posicao valor maximo: "+pos);
    }

    public static void main(String[] args) {
        
        System.out.println("Escreva numero n: ");
        int n = input.nextInt();
        int[] x = new int[n];
        for(int i = 0; i < n ; i++){
            System.out.println("Escreve numero da colocar no vetor: ");
            int num = input.nextInt();
            x[i] = num;

        }

        max(x);

        
    }
}