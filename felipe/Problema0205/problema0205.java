import java.util.Scanner;

public class problema0205{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double h = 0;

        System.out.print("Digite o número de termos: ");
        n = Integer.parseInt(input.nextLine());

        for(int i = 1; i <= n; i++){
            h = h + (double)1 / i;
            System.out.print(h+"\n");
        }
        
    }
}