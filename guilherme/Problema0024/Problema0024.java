import java.util.Scanner;

public class Problema0024 {
    static Scanner input = new Scanner(System.in);
   
    public static void main(String[] args){
        //Entrada
        int n1, n2, n3, multi;
        System.out.print("Digite o primeiro número: ");
        n1 = Integer.valueOf(input.nextLine());
        System.out.print("Digite o segundo número: ");
        n2 = Integer.valueOf(input.nextLine());
        System.out.print("Digite o terceiro número: ");
        n3 = Integer.valueOf(input.nextLine());

        //Processamento
        multi = n1 * n2 * n3;

        //Saída
        System.out.println("A multiplicação entre os 3 números é: " + multi);

    }
}