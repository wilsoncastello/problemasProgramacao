package problemasProgramacao.cristopher.Problema0376;

import java.util.Scanner;

public class problema0376 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float[][] matrizA = new float[2][3];
        int contTotal = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o numero na posicao ["+i+", "+j+"]:");
                matrizA[i][j] = Float.valueOf(input.nextLine());

                if(!(matrizA[i][j] >= 5 && matrizA[i][j] <= 15)){
                    contTotal++; 
                }
            }
        }

        System.out.println(contTotal);

        input.close();
        
    }
    
}
