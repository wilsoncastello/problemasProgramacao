package problemasProgramacao.cristopher.Problema0390;

import java.util.Scanner;

public class problema0390 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float[][] matriz = new float[5][5];

        //Preenchendo a matriz
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Digite o numero na posicao ["+i+", "+j+"]: ");
                matriz[i][j] = Float.valueOf(input.nextLine());
            }
            
        }
        
        int opcao = 0;
        System.out.print("Deseja solicitar uma linha para ser verificada? 0 (sim), -1 (não)");
        opcao = Integer.valueOf(input.nextLine());

        while(opcao != -1){
            System.out.print("Escolha uma linha para verificar (de 0 a 4): ");
            int linhaEscolhida = Integer.valueOf(input.nextLine());

            for (int j = 0; j < 5; j++) {
                System.out.println(matriz[linhaEscolhida][j]);
            }
            
            System.out.print("Deseja solicitar uma linha para ser verificada? 0 (sim), -1 (não)");
            opcao = Integer.valueOf(input.nextLine());
        }
        
        input.close();
        
    }
    
}
