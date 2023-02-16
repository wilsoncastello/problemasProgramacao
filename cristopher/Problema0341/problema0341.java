package problemasProgramacao.cristopher.Problema0341;

import java.util.Scanner;

public class problema0341 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua frase com letras minusculas: ");
        String frase = input.nextLine();

        frase = frase.toLowerCase();

        char vetorFrase[] = frase.toCharArray();

        for (int i = 0; i < frase.length(); i++) {
            if(i == 0 ){
                vetorFrase[i] = Character.toUpperCase(frase.charAt(i));
            }

            if(vetorFrase[i] == ' '){
                vetorFrase[i+1] = Character.toUpperCase(frase.charAt(i+1));
            }
        }

        System.out.println(vetorFrase);

        input.close();
        
    }
    
}
