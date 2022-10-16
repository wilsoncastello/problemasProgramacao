package problemasProgramacao.cristopher.Problema0082;

import java.util.Scanner;

public class problema0082 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int numero1 = Integer.valueOf(input.nextLine());
        System.out.println("Digite o segundo número inteiro: ");
        int numero2 = Integer.valueOf(input.nextLine());

        if(numero1 % numero2 == 0 || numero2 % numero1 == 0){
            System.out.println("São múltiplos.");

        }else{
            System.out.println("Não são múltiplos.");
        }


        input.close();
    }

  

}