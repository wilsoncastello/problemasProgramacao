package raphael.Problema0199;

import java.util.Scanner;

public class Problema0199 {
    
/* Entrar com 20 números e imprimir a soma dos números cujos quadrados são menores do que 225. */

    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in);

        int numero, somador=0;

        for (int i=0;i<20;i++) {

            System.out.println("Digite o "+(i+1)+"º numero: ");
            numero = Integer.valueOf(input.nextLine());

            if ((numero * numero) < 225) {
                somador = somador + numero;
            }
        }

        System.out.println("A soma dos numeros cujo quadrado é menor do que 225 é: "+somador);

    }

}