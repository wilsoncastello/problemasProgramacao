package stephanie.Problema0140;

import java.util.Scanner;

public class Problema0140 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro que esteja na faixa de valores de 1 até 9: ");
        int n = Integer.parseInt(input.nextLine());
        if(n>=1 && n<=9){
            System.out.println("O valor está na faixa permitida");
        }else{
            System.out.println("O valor está fora da faixa permitida");
        }
    }
}