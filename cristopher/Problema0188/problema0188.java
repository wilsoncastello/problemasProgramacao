package problemasProgramacao.cristopher.Problema0188;

import java.util.Scanner;

public class problema0188 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("TABELA DE CONVERSÃO DE POLEGADA PARA CENTÍMETRO");
        for (int i = 1; i <= 20; i++) {
            System.out.println("["+i+"] Polegada(s): " + i * 2.54f + " centímetros.");
        }

        input.close();

    }
    
}
