package problemasProgramacao.cristopher.Problema0425;

import java.util.Scanner;

public class problema0425 {

    public static int calculaFatorial(int x){
        int fatorial = 1;

        for (int i = 1; i <= x; i++) {
            fatorial = fatorial * i;
        }

        return fatorial;
    }

    public static int combinacao(int n, int p){
        int resultado = calculaFatorial(n) / (calculaFatorial(p) * calculaFatorial(n-p));
        return resultado;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor de 'n' para a combinação: ");
        int n = Integer.valueOf(input.nextLine());

        System.out.println("Digite o valor de 'p' para a combinação: ");
        int p = Integer.valueOf(input.nextLine());

        System.out.println(combinacao(n, p));

        input.close();
        
    }
    
}
