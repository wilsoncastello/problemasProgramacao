import java.util.Scanner;
public class Problema0117{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n;
        boolean x = false;
        System.out.println("Digite um número: ");
        n = Integer.valueOf(input.nextLine());
        if(n > 20 && n < 90)
            x = true;
        else
            x = false;

        if(x == true){
            System.out.println("O número está entre 20 e 90");
        }else{
            System.out.println("O número não está entre 20 e 90");
        }
    }
}