//Implementar um algoritmo para calcular o valor de e^X O valor de X devera ser digitado. O valor de e^X será calculado pela soma dos 10 primeiros termos da serie a seguir: e^x = 1 + x + x^2/2! + x^3/3! + ...   

package Problema0207;

import java.lang.Math;
import java.util.Scanner;

public class Problema0207 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
             
        float x;
        
            System.out.println("Digite o valor de x");
            x = Float.valueOf(input.nextLine());
            
            float soma = 0;
            float fat = 1;

            for (int i = 0; i<10; i++){
    
                int j =i;
                if(i>0){
                    fat = i;
                }

                while(i > 1){
                    fat = fat * (i-1);
                    i--;
                }
                
                i= j;
               
                
            soma = (float) (soma +  Math.pow(x, i)/fat);
           }
            
            System.out.println("e^x = " + soma);
         
}
}
