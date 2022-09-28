package problemasProgramacao.cristopher.Problema0035;

import java.util.Scanner;

public class problema0035{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Informe o número de lados do polígono: ");
        int n = Integer.valueOf(input.nextLine());

        int numeroDiagonais;

        numeroDiagonais = n * (n - 3) / 2;

        System.out.println("O número de diagonais do polígono é: " + numeroDiagonais);
        
        input.close();
    }

}