import java.util.Scanner;


public class problema0194 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Escreve o primeiro numero: ");
        int n1 = input.nextInt();

        System.out.println("Escreve o segundo numero: ");
        int n2 = input.nextInt();

        int somatorio = 0;

        for(int i = n1+1; i<n2;i++){
            int m = i%2;
            if(m == 0){
                somatorio = somatorio + i;
                System.out.println(i);

            }
 
        }
        System.out.println("Somatorio: "+somatorio);

    }
}