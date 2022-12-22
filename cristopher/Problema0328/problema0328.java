package problemasProgramacao.cristopher.Problema0328;

import java.util.Scanner;

public class problema0328 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char vetorSexos[] = new char[10];

        for (int i = 0; i < vetorSexos.length; i++) {
            System.out.println("Informe o sexo da pessoa (M ou F): ");
            vetorSexos[i] = input.next().charAt(0);
        }

        int contMasculinos = 0;

        for (int i = 0; i < vetorSexos.length; i++) {
            if(vetorSexos[i] == 'm' || vetorSexos[i] == 'M'){
                contMasculinos++;
            }
        }

        System.out.println("O total de pessoas do sexo masculino é -> " + contMasculinos);

        input.close();
        
    }
    
}
