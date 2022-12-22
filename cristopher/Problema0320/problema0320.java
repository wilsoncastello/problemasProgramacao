package problemasProgramacao.cristopher.Problema0320;

import java.util.Scanner;

public class problema0320{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int vetorA[] = new int [5];
        int vetorB[] = new int [5];
        
        System.out.println("VETOR A");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("Informe o numero na posicao ["+i+"]: ");
            vetorA[i] = Integer.valueOf(input.nextLine());
            while(!(vetorA[i] % 2 == 0 || vetorA[i] % 3 == 0)){
                System.out.println("Por favor, respeite as condições...");
                System.out.print("Informe o numero na posicao ["+i+"]: ");
                vetorA[i] = Integer.valueOf(input.nextLine());
            }
        }

        System.out.println("VETOR B");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("Informe o numero na posicao ["+i+"]: ");
            vetorB[i] = Integer.valueOf(input.nextLine());
            while(vetorB[i] % 5 == 0){
                System.out.println("Por favor, respeite as condições...");
                System.out.print("Informe o numero na posicao ["+i+"]: ");
                vetorB[i] = Integer.valueOf(input.nextLine());
            }
        }

        int vetorC[] = new int[10];
        for (int i = 0; i < 5; i++) {
            vetorC[i] = vetorA[i];
        }

        int j = 0;
        for (int i = 5; i < 10; i++) {
            vetorC[i] = vetorB[j];
            j++;
        }

        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(vetorC[i]+ "   ");
        }
        
        input.close();
    }

    


}