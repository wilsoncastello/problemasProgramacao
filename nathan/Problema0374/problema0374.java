package Problema0374;

import java.util.Scanner;

public class problema0374{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vDiaria[][] = new int [5][6];
        int totalVendasDia[] = new int[6];
        int somaVendedor = 0, somaTotal = 0;
        for (int i = 0; i < 5; i++) {
            somaVendedor = 0;
            System.out.println("Dados do vendedor " + (i+1) + ": ");
            for (int j = 0; j < 6; j++) {
                System.out.println("Venda do " + (j+1) + "° dia: ");
                vDiaria[i][j] = Integer.valueOf(input.nextLine());
                somaVendedor = somaVendedor + vDiaria[i][j];
                somaTotal = somaTotal + vDiaria[i][j];
                totalVendasDia[j] = totalVendasDia[j] + vDiaria[i][j];                
            }
            System.out.println("\nTotal de vendas da semana do vendedor " + (i+1) + " é: " + somaVendedor);
        }

        System.out.println("\nVendas dos dias de todos os vendedores somados");
        for (int i = 0; i < 6; i++) {
            System.out.println("Vendas do " + (i+1) + " dia: " + totalVendasDia[i]);
        }

        System.out.println("\nSoma total das vendas: " + somaTotal);
    }
}