import java.util.Scanner;

public class Problema0379{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] m = new int[3][4];
        int qtdPares = 0, somaImpares = 0, soma = 0;
        float media; 
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.println("Digite o elemento da linha: "+i+", coluna: "+j);
                m[i][j] = Integer.valueOf(input.nextLine());
                if(m[i][j] % 2 == 0)
                    qtdPares++;
                if(m[i][j] % 2 == 1)
                    somaImpares += m[i][j];
                soma += m[i][j];
            }
        }
        media = (float)soma/12;
        System.out.println("Quantidade de elementos pares: "+qtdPares);
        System.out.println("Soma dos elementos impares:"+somaImpares);
        System.out.println("Média de todos os elementos: "+media);
    }
}