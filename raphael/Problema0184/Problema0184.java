package raphael.Problema0184;

public class Problema0184 {
    
/* Criar um algoritmo que imprima todos os números de 1 até 100 e a soma deles. */

    public static void main(String[] args) { 

        int somador=0;

        for (int i=1;i<101;i++) {

            System.out.println(i);
            somador = somador + i;
        }

        System.out.println("\n A soma de todos os numeros é: "+somador);

    }

}
