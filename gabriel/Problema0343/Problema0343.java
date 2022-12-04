package Problema0343;

import java.util.Scanner;
public class Problema0343 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
          System.out.println("Digite uma frase: ");
          String frase = input.nextLine();
          String fraseLower = frase.toLowerCase();
          
          if(fraseLower.contains("de janeiro")){
              
              System.out.println(fraseLower.replaceAll("de janeiro", "1"));
          }
          
          else if(fraseLower.contains("de fevereiro")){
              System.out.println(frase.replaceAll("de fevereiro", "2"));
          }
          
          else if(fraseLower.contains("de marco")){
              System.out.println(frase.replaceAll("de marco", "3"));
          }
          
          else if(fraseLower.contains("de abril")){
              System.out.println(frase.replaceAll("de abril", "4"));
          }
          
          else if(fraseLower.contains("de maio")){
              System.out.println(frase.replaceAll("de maio", "5"));
          }
          
          else if(fraseLower.contains("de junho")){
              System.out.println(frase.replaceAll("de junho", "6"));
          }
          
          else if(fraseLower.contains("de julho")){
              System.out.println(frase.replaceAll("de julho", "7"));
          }
          
          else if(fraseLower.contains("de agosto")){
              System.out.println(frase.replaceAll("de agosto", "8"));
          }
          
          else if(fraseLower.contains("de setembro")){
              System.out.println(frase.replaceAll("de setembro", "9"));
          }
          
          else if(fraseLower.contains("de outubro")){
              System.out.println(frase.replaceAll("de outubro", "10"));
          }
          
          else if(fraseLower.contains("de novembro")){
              System.out.println(frase.replaceAll("de novembro", "11"));
          }
          
          else if(fraseLower.contains("de dezembro")){
              System.out.println(frase.replaceAll("de dezembro", "12"));
          }

          else{
            System.out.println(frase);
          }
          
          
      }
      
  }

