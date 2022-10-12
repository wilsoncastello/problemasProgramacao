package problemasProgramacao.cristopher.Problema0233;

import java.util.Scanner;

public class problema0233 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int resultado = 0;

        System.out.print("Digite um numero: ");
        int numero = Integer.valueOf(input.nextLine());

        System.out.print("Digite por quantas vezes quer multiplicar esse numero: ");
        int vezes = Integer.valueOf(input.nextLine());

        for (int i = 0; i < vezes; i++) {
            resultado = resultado + numero;
            
        }

        System.out.println("O resultado de "+numero+"x"+vezes+" é: " + resultado);

        
        
    }
    
}
