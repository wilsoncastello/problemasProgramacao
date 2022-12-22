package problemasProgramacao.cristopher.Problema0306;

import java.util.Scanner;

public class problema0306 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] vetorA = new int[10];
        int [] vetorB = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Digite o número na posição ["+i+"]: ");
            vetorA[i] = Integer.valueOf(input.nextLine());
        }

        for (int i = 0; i < vetorB.length; i++) {
            vetorB[i] = -(vetorA[i]);
            System.out.println(vetorB[i]);
        }


        input.close();
        
    }
}
