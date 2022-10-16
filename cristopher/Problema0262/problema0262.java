package problemasProgramacao.cristopher.Problema0262;

import java.util.Scanner;

public class problema0262 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetor = new int[10];
        int contMaioresQue50 = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o número na posição ["+i+"]: ");
            vetor[i] = Integer.valueOf(input.nextLine());
        }

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > 50){
                contMaioresQue50++;
                System.out.println("["+i+"]: " + vetor[i] + " é maior que 50.");
            }

            
        }

        if(contMaioresQue50 == 0){
            System.out.println("Não existe nenhum número com essa condição.");

        }


        input.close();
        
    }
    
}
