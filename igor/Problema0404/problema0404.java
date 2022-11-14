import java.util.Scanner;
public class problema404 {

    static Scanner input = new Scanner(System.in);

    public static void tabuada(int n){
        for(int i = 1; i<=10;i++){
            int m = n*i;
            System.out.println(n+"*"+i+"= "+m);
        }
    }

    public static void main(String[] args) {
        System.out.println("Escreve um numero: ");
        int n = input.nextInt();
        tabuada(n);
    }
}