package Problema0315;

import java.util.Scanner;
public class Problema0315 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int vetorA[] = new int[10];
        int vetorB[] = new int[10];
        int fat, j;
        
        
        for(int i=0; i<10; i++){
            System.out.println("Digite o valor inteiro do vetor A na posição " + i + ": ");
            vetorA[i] = Integer.valueOf(input.nextLine());
        }
        
        
        for(int i=0; i<10; i++){
            fat = 1;
            j  = 2;
            
            while(j <= vetorA[i]){
                fat = fat * j;
                j++;
            }
            
            vetorB[i] = fat;
            if(vetorA[i] < 0){
                vetorB[i] = 0;
    }
            
        }
        
        int auxiliar = 0;
        
        for(int i=0; i<10; i++){
            for(j=i+1; j<10; j++){
                if(vetorB[i] > vetorB[j]){
                    auxiliar = vetorB[i];
                    vetorB[i] = vetorB[j];
                    vetorB[j] = auxiliar;
                }
            }
        }
        
         System.out.println("Vetor B");
         for(int i=0; i<10; i++){
             if(vetorB[i] > 0){
             System.out.println(vetorB[i]);
            }
         }
     }
     
 }