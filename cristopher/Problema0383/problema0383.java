package problemasProgramacao.cristopher.Problema0383;

import java.util.Scanner;

public class problema0383 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float[][] matriz = new float[3][4];

        //Preenchendo a matriz
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("Digite o número na posição ["+i+", "+j+"]: ");
                matriz[i][j] = Float.valueOf(input.nextLine());
            }
            
        }

        //Transpondo a Matriz
        float[][] matrizTransposta = new float[4][3];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTransposta[i][j] = matriz[j][i];
            }
            
        }

        //Imprimindo a Matriz
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("  |  " + matrizTransposta[i][j] + "  |  ");
            }
            System.out.println("");
        }

        

        input.close();
        
    }
    
}
