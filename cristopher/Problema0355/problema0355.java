package problemasProgramacao.cristopher.Problema0355;

import java.util.Scanner;

public class problema0355 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Digite um frase contendo um numero: ");
        String frase = input.nextLine();
        char[] vetorFrase;
        vetorFrase = frase.toCharArray();
        int posicaoNum = 0;

        for(int i = 0; i < vetorFrase.length;i++){
            if(vetorFrase[i] == '0' || vetorFrase[i] == '1' || vetorFrase[i] == '2' || vetorFrase[i] == '3' || vetorFrase[i] == '4' || vetorFrase[i] == '5' || vetorFrase[i] == '6' || vetorFrase[i] == '7' || vetorFrase[i] == '8' || vetorFrase[i] == '9'){
            posicaoNum = vetorFrase[i];
            }
        }
        for(int i = 0; i < vetorFrase.length;i++){
            if(vetorFrase[i] == posicaoNum){
                if(vetorFrase[i] == '0')
                    System.out.print("zero");
                else if(vetorFrase[i] == '1')
                    System.out.print("um");
                else if(vetorFrase[i] == '2')
                    System.out.print("dois");
                else if(vetorFrase[i] == '3')
                    System.out.print("tres");
                else if(vetorFrase[i] == '4')
                    System.out.print("quatro");
                else if(vetorFrase[i] == '5')
                    System.out.print("cinco");
                else if(vetorFrase[i] == '6')
                    System.out.print("seis");
                else if(vetorFrase[i] == '7')
                    System.out.print("sete");
                else if(vetorFrase[i] == '8')
                    System.out.print("oito");
                else if(vetorFrase[i] == '9')
                    System.out.print("nove");
                }
            else{
                System.out.print(vetorFrase[i]);
            }
        }


        input.close();
        
    }
    
}
