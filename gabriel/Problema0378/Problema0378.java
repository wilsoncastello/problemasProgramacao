package Problema0378;
import java.util.Scanner;

public class Problema0378 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int matriz [][] = new int [4][3];
        float soma = 0, contador = 0, media;
        
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                System.out.println("Digite o numero armazenado na linha " +i+ " e da couna "+j);
                matriz [i][j] = Integer.valueOf(input.nextLine());
            }
        }
        
        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                if(i % 2 == 0){
                    soma = soma + matriz [i][j];
                    contador = contador + 1;
                }
            }
        }
        
        media = soma / contador;
        
        System.out.println("A média dos elementos da linhas pares: "+media);
    }
    
}

