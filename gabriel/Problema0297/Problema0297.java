package Problema0297;

import java.util.Scanner;
public class Problema0297 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String vetorNome[] = new String[10];
        String vetorCPF[] = new String[10];
        String vetorProfissao[] = new String[10];
        int vetorContador[] = new int[10];
    
        for(int i=0; i<10; i++){
          System.out.println("Digite o nome da pessoa da posição " + i + ": "); 
          vetorNome[i] = input.nextLine();
    
          System.out.println("Digite o cpf de " + vetorNome[i] + ": ");
          vetorCPF[i] = input.nextLine();
    
          System.out.println("Digite a profissão de " + vetorNome[i] + ": ");
          vetorProfissao[i] = input.nextLine(); 
        }
    
        for(int i=0; i<10; i++){
          vetorContador[i] = 1;
          for(int j=i+1; j<10; j++){
            if(vetorProfissao[i].equals(vetorProfissao[j])){
              vetorContador[i]++;
              vetorProfissao[j] = "null";
            }
          }
        }
    
        for(int i=0; i<10; i++){
          if(!vetorProfissao[i].equals("null")){
            System.out.println("Profissão "+vetorProfissao[i] + ": " + vetorContador[i]);
          }
        }
        
      }
    }

