package Problema0385;

import java.util.Scanner;
public class Problema0385 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float matriz [][] = new float [2][2];
        float determinante;
        
        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.println("Digite o valor armazenado na linha " +i+ " e na coluna "+j);
                matriz[i][j] = Float.valueOf(input.nextLine());
            }
        }
        
        determinante = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
        
        System.out.println("Determinante da matriz: " +determinante);
            
    }
    
}
}
