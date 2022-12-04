package Problema0448;

import java.util.Scanner;
public class Problema0448 {
    public static int[] calcularInterseccao(int vetorA[], int vetorB[]){
       
        int vetorC[] = new int[10]; 
        
        for(int i=0; i<10; i++){
            for(int j =0; j<10; j++){
                if(vetorA[i] == vetorB[j]){
                    vetorC[i] = vetorA[i];
                }
                    
            }
        }
        
        for(int i=0; i<10; i++){
            for(int j =i+1; j<10; j++){
                if(vetorC[i] == vetorC[j]){
                vetorC[j] = 0;
                }
            }
         }
                
                
        return vetorC;
     }
 
     public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       int vetorA[] = new int[10];
       int vetorB[] = new int[10];
       
         System.out.println("Digite os dados do vetor A");
       for(int i=0; i<10; i++){
           System.out.println("Digite o valor da posição: "+i);
           vetorA[i] = Integer.valueOf(input.nextLine());
       }
       
         System.out.println("Digite os dados do vetor B");
       for(int i=0; i<10; i++){
           System.out.println("Digite o valor da posição: "+i);
           vetorB[i] = Integer.valueOf(input.nextLine());
       }
       
       int vetorC[] = calcularInterseccao(vetorA, vetorB);
       
         System.out.println("Vetor Intersecção");
       for(int i=0; i<10; i++){
           if(vetorC[i] != 0){
           System.out.println(vetorC[i]);
       }
       }
       
     }
 }
