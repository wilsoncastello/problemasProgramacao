package Problema0269;

import java.util.Scanner;

public class problema0269{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        int vA[] = new int[10];
        int aux = 0, cont = 0;
    
        for (int i = 0; i < 10; i++) {
          System.out.println("Digite o vetor na posição " + i + ": ");
          vA[i] = Integer.valueOf(input.nextLine());
        }
    
        for (int i = 0; i < 10; i++) {
          if(aux != vA[i]){
            for (int j = 0; j < 10; j++) {
              aux = vA[i];
              if (aux == vA[j]) {
                cont++;
              }
            }
            if (cont > 1) {
              System.out.println(aux + " se repete " + cont + " vezes");
            }
            cont = 0;
          }
        }  
      }
}