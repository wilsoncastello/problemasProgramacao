package Probema0192;

import java.util.Scanner;

public class Problema0192 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o primeiro e o último valor inteiro de um intervalo");
        int n0 = Integer.valueOf(input.nextLine());
        int nx = Integer.valueOf(input.nextLine());
        
        if(n0 < nx){
            for(int i = n0; i<nx + 1; i++){
            System.out.println(i);
            }
        }

        else{
            for(int i = nx; i<n0 + 1; i++){
                System.out.println(i);
        }
    }
}
}