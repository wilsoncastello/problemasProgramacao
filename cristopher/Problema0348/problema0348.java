package problemasProgramacao.cristopher.Problema0348;

import java.util.Scanner;

public class problema0348 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe uma frase a ser separada: ");
        String frase = input.nextLine();

        char[] vetorFrase = new char[frase.length()];
        vetorFrase = frase.toCharArray();

        for (int i = 0; i < vetorFrase.length; i++) {
            if(vetorFrase[i] == ' '){
                vetorFrase[i] = '\n';
            }
        }

        System.out.println(vetorFrase);

        input.close();
        
    }
    
}
