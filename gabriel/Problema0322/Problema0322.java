package Problema0322;

import java.util.Scanner;
public class Problema0322 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
         System.out.println("Digite uma mensagem: ");
         String mensagem = input.nextLine();
         
         String mensagemLower = mensagem.toLowerCase();
         
         int contA=0, contE=0, contI=0, contO=0, contU=0;
         char vetorMensagem[] = mensagemLower.toCharArray();
         
         for(int i=0; i<mensagem.length(); i++){
             switch(vetorMensagem[i]){
                 
                 case 'a':
                     contA = contA + 1;
                     break;
                     
                 case 'e': 
                     contE = contE + 1;
                     break;
                     
                 case 'i': 
                     contI = contI + 1;
                     break;
                     
                 case 'o':
                     contO = contO + 1;
                     break;
                     
                 case 'u': 
                     contU = contU + 1;
                     break;
             }
         }
         
         System.out.println("Quantidade de 'a' e 'A' na mensagem digitada: " + contA);
         System.out.println("Quantidade de 'e' e 'E' na mensagem digitada: " + contE);
         System.out.println("Quantidade de 'i' e 'I' na mensagem digitada: " + contI);
         System.out.println("Quantidade de 'o' e 'O' na mensagem digitada: " + contO);
         System.out.println("Quantidade de 'u' e 'U' na mensagem digitada: " + contU);
     }
     
 }
 
