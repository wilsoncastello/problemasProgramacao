package Problema0413;

import java.util.Scanner;
public class Problema0413 {
    public static float somarMatriz(float matrizA[][]){
        float soma = 0;
        
        for(int i = 0; i<3; i++){
          for(int j=0; j<3; j++){
            soma = soma + matrizA[i][j];
          }
          
        }
        
        return soma;
      }
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
  
      float matrizA[][] = new float[3][3];
      float soma =0;
  
      for(int i=0; i<3; i++){
        for(int j=0; j<3; j++){
          System.out.println("Digite o elemento correspondente a linha "+i+" e a coluna "+j);
          matrizA[i][j] = Float.valueOf(input.nextLine());
        }
      }
  
      soma = somarMatriz(matrizA);
  
      System.out.println("Soma dos elementos da matriz A: "+soma);
    }
  }    

