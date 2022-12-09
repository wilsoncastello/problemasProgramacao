package Problema0402;

import java.util.Scanner;
public class Problema0402 {
    public static int somarElementos(int a, int b, int c){
        int soma = 0;
        
        for(int i = b; i<c+1; i++){
          if(i % a == 0){
            soma = soma + i;
          }
        }
        return soma;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        int a, b, c;
    
        System.out.println("Digite o valor de 'a', sendo um valor maior que 1: ");
        a = Integer.valueOf(input.nextLine());

        while(a <= 1){
            System.out.println("Digite um valor valido");
            System.out.println("Digite o valor de 'a', sendo um valor maior que 1: ");
            a = Integer.valueOf(input.nextLine());
        }
    
        System.out.println("Digite o valor de 'b': ");
        b = Integer.valueOf(input.nextLine());
    
        System.out.println("Digite o valor de 'c': ");
        c = Integer.valueOf(input.nextLine());
    
        int soma = somarElementos(a, b, c);
    
        System.out.println("Soma dos valores entre b e c, que são divisíveis por a: " + soma);
      }
    } 


