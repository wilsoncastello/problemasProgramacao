package Problema0013;

import java.util.Scanner;

public class problema0013 {
    static Scanner input = new Scanner(System.in);
   
    public static void main(String[] args) {
        
        System.out.println("Digite o preço de fábrica do veículo: ");
        double precoFabrica = Double.valueOf(input.nextLine());
        System.out.println("Digite o percentual de lucro do distribuidor: ");
        double percDistribuidor = Double.valueOf(input.nextLine());
        System.out.println("Digite o percentual de impostos: ");
        double percImposto = Double.valueOf(input.nextLine());
        
        double lucroDistribuidor = (precoFabrica * percDistribuidor) / 100;
        double valorImpostos = (precoFabrica * percImposto) / 100;
        double precoFinal = precoFabrica + lucroDistribuidor + valorImpostos;
        
        System.out.println("Lucro do distribuidor: " + lucroDistribuidor);
        System.out.println("Valor correspondente aos impostos: " + valorImpostos);
        System.out.println("Preço final do veículo: " + precoFinal);
    }
}
