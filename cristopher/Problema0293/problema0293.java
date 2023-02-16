package problemasProgramacao.cristopher.Problema0293;

import java.util.Scanner;

public class problema0293 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float [] vetor = new float[10];
        float somaDosNumeros = 0, media = 0;
        int contMaioresMedia = 0, contIguaisMedia = 0, contIguais30 = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o número na posição ["+i+"]: ");
            vetor[i] = Float.valueOf(input.nextLine());

            somaDosNumeros = somaDosNumeros + vetor[i];


        }

        media = somaDosNumeros / vetor.length;

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > media){
                contMaioresMedia++;
            }

            if(vetor[i] == 30){
                contIguais30++;
            }

            if(vetor[i] == media){
                contIguaisMedia++;
            }
        }

        System.out.println("Maiores que a média -> " + contMaioresMedia);
        System.out.println("Iguais a 30 -> " + contIguais30);
        System.out.println("Iguais a média -> " + contIguaisMedia);


        input.close();
        
    }



    
}
