package Problema0207;

import java.util.Scanner;
public class Problema0207 {
    Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor do x: ");
        float x = Float.valueOf(input.nextLine());
        
        float fat = 1,soma =0, pot = 1, j=0;
        
        for(int i=0; i<10; i++){
            j=i;
            fat=1;
            
            while(j > 1){
                fat = fat * j;
                j--;
            }
            pot = 1;
            for(int k=0; k<i; k++){
            pot = pot * x;
            }
            
            soma = soma + pot / fat;
        }
        
        System.out.println("e^"+x+"= "+soma);
        
   }


