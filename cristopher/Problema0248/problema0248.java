package problemasProgramacao.cristopher.Problema0248;

import java.util.Scanner;

public class problema0248 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float[] vetorA = new float[5];
        float[] vetorB = new float[5];
        float[] vetorC = new float[5];
        float[] vetorD = new float[15];

        System.out.println("Preenchendo o vetor A: ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("["+i+"]: ");
            vetorA[i] = Float.valueOf(input.nextLine());
        }

        System.out.println("Preenchendo o vetor B: ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("["+i+"]: ");
            vetorB[i] = Float.valueOf(input.nextLine());
        }

        System.out.println("Preenchendo o vetor C: ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print("["+i+"]: ");
            vetorC[i] = Float.valueOf(input.nextLine());
        }

        int j = 0;
        for (int i = 0; i < vetorA.length; i++) {
            vetorD[j++] = vetorA[i];
        }

        for (int i = 0; i < vetorB.length; i++) {
            vetorD[j++] = vetorB[i];
        }

        for (int i = 0; i < vetorC.length; i++) {
            vetorD[j++] = vetorC[i];
        }

        System.out.println("Imprimindo o vetor D (junção): ");
        for (int i = 0; i < vetorD.length; i++) {
            System.out.println("["+i+"]: "+ vetorD[i]);
        }
        
        
        input.close();
        
    }
    
}
