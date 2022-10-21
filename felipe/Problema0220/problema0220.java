import java.util.Scanner;

public class problema0220{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, fact = 1;

        System.out.print("Digite um número inteiro não negativo: ");
        n = Integer.parseInt(input.nextLine());

        for(int i = 1; i <= n; i++){    
            fact = fact * i;
            System.out.println(fact);
        } 
 
    }
}