import java.util.Scanner;

public class Problema0421{
    static Scanner input = new Scanner(System.in);

    public static void primo(int n){
        boolean ehPrimo = true;
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                ehPrimo = false;
            }
        } 
        if(ehPrimo == false){
            System.out.println("O número "+n+" não é primo!");
        }else{
            System.out.println("O número "+n+" é primo!");
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Digite um número: ");
        n = Integer.valueOf(input.nextLine());
        primo(n);
    }
}