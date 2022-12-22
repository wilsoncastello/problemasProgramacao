package problemasProgramacao.cristopher.Problema0411;

import java.util.Scanner;

public class problema0411 {

    public static int[] vetorUniao(int[] vetorA, int[] vetorB){
        int[] vetorC = new int[vetorA.length + vetorB.length];
        int k = 0;
        
        for (int i = 0; i < vetorA.length; i++) {
            vetorC[k++] = vetorA[i];
        }

        for (int i = 0; i < vetorB.length; i++) {
            if(!(existe(vetorB[i], vetorC, k))){
                vetorC[k++] = vetorB[i];
            }
        }

        return vetorC;
    }

    public static boolean existe(int x, int[] vetorC, int k){
        for (int i = 0; i < k; i++) {
            if(vetorC[i] == x){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] vetorA = new int[5];
        int[] vetorB = new int[5];

        System.out.println("Preenchendo o vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o numero na posicao ["+i+"]: ");
            vetorA[i] = Integer.valueOf(input.nextLine());
        }

        System.out.println("Preenchendo o vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Digite o numero na posicao ["+i+"]: ");
            vetorB[i] = Integer.valueOf(input.nextLine());
        }

        //Chamando a funcao uniao
        int[] vetorC;
        vetorC = vetorUniao(vetorA, vetorB);

        for (int i = 0; i < vetorC.length; i++) {
            System.out.print("[ "+ vetorC[i] + " ]");
        }

        input.close();
        
    }
    
}
