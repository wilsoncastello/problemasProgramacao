package problemasProgramacao.cristopher.Problema0112;

import java.util.Scanner;

public class problema0112 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe um número qualquer: ");
        float numero = Float.valueOf(input.nextLine());

        if(numero > 0){
            System.out.println("Imprimindo a raiz quadrada: " + Math.sqrt(numero));

        }else{
            System.out.println("Imprimindo o quadrado do número: " + Math.pow(numero, 2));
        }



        input.close();
    }
    
}
