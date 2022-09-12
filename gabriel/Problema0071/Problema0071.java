//O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem de lucro do revendedor e com o custo dos impostos (aplicados ao custo de fábrica). Supondo que a percentagem do revendedor seja de 25% e que os impostos custam 45% do custo de fábrica, faça um algoritmo para determinar o preço final do automóvel (custo ao consumidor).

package Problema0071;

import java.util.Scanner;

public class Problema0071 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float custoFabrica, precoVenda;

        //entrada
        System.out.println("Digite o preço de fábrica do veículo: ");
        custoFabrica = Float.valueOf(input.nextLine());

        //cálculo
        precoVenda = (float) ((custoFabrica) + (custoFabrica * 0.25) + (custoFabrica * 0.45));

        //saída
        System.out.println("Preço Final ao consumidor: " + precoVenda);


    }

}