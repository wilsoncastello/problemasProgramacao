package problemasProgramacao.cristopher.Problema0278;

import java.util.Scanner;

public class problema0278 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int maiorNumero = Integer.MIN_VALUE, posicaoMaior = 0, menorNumero = Integer.MAX_VALUE, posicaoMenor = 0;

        int [] vetor = new int [10];

        for(int i = 0; i < 10; i++){
            System.out.println("Digite o número na posição ["+i+"]: ");
            vetor[i] = Integer.valueOf(input.nextLine());
        }

        for (int i = 0; i < 10; i++) {
            if(vetor[i] > maiorNumero){
                maiorNumero = vetor[i];
                posicaoMaior = i;
            }

            if(vetor[i] < menorNumero){
                menorNumero = vetor[i];
                posicaoMenor = i;
            }
        }

        System.out.println("O maior numero é " + maiorNumero + " e sua posição é " + posicaoMaior + ".");
        System.out.println("O menor numero é " + menorNumero + " e sua posição é " + posicaoMenor + ".");

        input.close();
        
    }



}