package Problema0392;

import java.util.Scanner;
public class Problema0392 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int M[][] = new int[4][4];
        int soma = 0;
        
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.println("Digite o valor armazenado na linha " +i+ " e na coluna " +j);
                M[i][j] = Integer.valueOf(input.nextLine());
            }
        }
        
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                if(i % 2 == 0 || j % 2 != 0){
                    soma = soma + M[i][j];
                }
            }
        }
        
        System.out.println("Soma dos elementos das linhas pares e colunas imares: " +soma);
    }
    
}
