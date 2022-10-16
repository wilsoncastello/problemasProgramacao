package problemasProgramacao.cristopher.Problema0270;

import java.util.Scanner;

public class problema0270 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[]vetorPrimos = new int[10];
        int k = 0;
        
        for(int i = 100; i < 150; i++) {
            
            boolean primo = true;
            
            for(int j = 2; j < i; j++) {
                
                if(i % j == 0) {
                    primo = false;
                }
                
            }

            if(primo) {
                vetorPrimos[k] = i;
                k++;
            }
            
        }

        for (int i = 0; i < vetorPrimos.length; i++) {
            System.out.println("["+i+"]: " + vetorPrimos[i]);
        }

        input.close();
    }
}
        
        
    
    

