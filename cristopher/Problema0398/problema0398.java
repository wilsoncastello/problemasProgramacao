package problemasProgramacao.cristopher.Problema0398;

import java.util.Scanner;

public class problema0398 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[4][5];

        //Preenchendo a matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Digite o número na posição ["+i+", "+j+"]: ");
                matriz[i][j] = Integer.valueOf(input.nextLine());
            }
        }

        //Imprimindo a matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("  |  " + matriz[i][j]);
            }
            System.out.println("  |  ");
        }
        
        input.close();
    }
    
}
