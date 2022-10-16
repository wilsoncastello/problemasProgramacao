package Problema0168;

import java.util.Scanner;

public class problema0168{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
     
        int contPrimo = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Digite o " + (i+1) +" número: ");
            double n = Double.valueOf(input.nextLine());
            if(n % 2 == 0 || n % 3 == 0){
                if(n == 2 || n == 3)
                    contPrimo++;
            }else
                contPrimo++;
        }
        System.out.println("Quantidade de primos: " + contPrimo);
    }
}
