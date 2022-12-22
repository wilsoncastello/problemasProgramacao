package problemasProgramacao.cristopher.Problema0363;

import java.util.Scanner;

public class problema0363 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] vetorNomeLojas = new String[8];
        String[] vetorProdutos = new String[4];
        float[][] matrizProdutosLoja = new float[8][4];

        for (int i = 0; i < vetorNomeLojas.length; i++) {
            System.out.println("Digite o nome da loja na posição ["+i+"]: ");
            vetorNomeLojas[i] = input.nextLine();
        }

        for (int i = 0; i < vetorProdutos.length; i++) {
            System.out.println("Digite o nome do produto na posição ["+i+"]: ");
            vetorProdutos[i] = input.nextLine();
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Loja ["+i+"] Produto ["+j+"]: R$ ");
                matrizProdutosLoja[i][j] = Float.valueOf(input.nextLine());
                
            }
            
        }

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                if(matrizProdutosLoja[i][j] <= 120){
                    System.out.println(vetorNomeLojas[i] + "-" + vetorProdutos[j]);
                }
            }
            
        }

        
        
        input.close();
        
    }
    
}
