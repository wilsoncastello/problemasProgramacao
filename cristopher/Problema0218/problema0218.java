package problemasProgramacao.cristopher.Problema0218;

import java.util.Scanner;

public class problema0218 {

    public static boolean ehPrimo(int n){
        if(n < 2){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

   public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Quantos números deseja verificar: ");
    int qtd = Integer.valueOf(input.nextLine());

    for (int i = 0; i < qtd; i++) {
        System.out.println("Digite um número par maior que 2: ");
        int numero = Integer.valueOf(input.nextLine());

        if(numero % 2 == 0 && numero > 2){
            boolean encontrado = false;
            for (int j = 2; j < numero; j++) {
                if(ehPrimo(j)){
                    int k = numero - j;
                    if(ehPrimo(k)){
                        encontrado = true;
                        if(j <= k){
                            System.out.println(numero + " = " + j + " + " + k);
                            break;
                        }
                    }
                }
            }
            if(encontrado == false){
                System.out.println("Não foi encontrado nenhum número primo.");
            }
        }
        else{
            System.out.println("Número inválido. ");
        }
    }

    input.close();
    
   }
}
