package problemasProgramacao.cristopher.Problema0203;

import java.util.Scanner;

public class problema0203 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float somaDosPositivos = 0;
        int contNegativos = 0;

        System.out.println("ENTRE COM 20 NÚMEROS");
        for (int i = 0; i < 20; i++) {
            System.out.println("["+i+"] Digite um número:  ");
            float numeroInformado = Float.valueOf(input.nextLine());
            if(numeroInformado >= 0){
                somaDosPositivos = somaDosPositivos + numeroInformado;
            }else{
                contNegativos++;
            }
            
        }

        System.out.println("Soma dos positivos: " + somaDosPositivos);
        System.out.println("Total de negativos: " + contNegativos);

        input.close();
        
    }
    
}
