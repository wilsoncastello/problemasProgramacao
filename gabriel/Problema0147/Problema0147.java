//Faça um programa que receba: O código de um produto comprado, supondo que a digitação do código do produto seja sempre válida, isto é, um número inteiro entre 1 e 10; O peso do produto em quilos. O código do país de origem, supondo que a digitação do código seja sempre válida, isto é, um número inteiro entre 1 e 3. Tabelas: Calcule e mostre: o peso do produto convertido em gramas; o preço total do produto comprado; o valor do imposto, sabendo que ele é cobrado sobre o preço total do produto comprado e depende do país de origem; o valor total, preço total do produto mais imposto.
//Código país de origem     imposto                              Código do produto       Preço por grama
//1                             0%                                    1 a 4                     10
//2                            15%                                    5 a 7                     25
//3                            25%                                    8 a 10                    35

import java.util.Scanner;
public class Problema0147 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int codigoProduto, codigoPais;
    float pesoKilo, pesoGrama;

    System.out.println("Digite o código do produto comprado: ");
    codigoProduto = Integer.valueOf(input.nextLine());

    System.out.println("Digite o peso do produto comprado (kg): ");
    pesoKilo = Float.valueOf(input.nextLine());

    System.out.println("Digite o codigo do país de origem: ");
    codigoPais = Integer.valueOf(input.nextLine());

    int precoGrama, imposto;

    //preço por grama
    if(codigoProduto == 1 || codigoProduto == 2 || codigoProduto == 3 || codigoProduto == 4){
        precoGrama = 10;
    }

    else if(codigoProduto == 5 || codigoProduto == 6 || codigoProduto == 7){
        precoGrama = 25;
    }

    else{
        precoGrama = 35;
    }

    //imposto
    if(codigoPais == 1){
        imposto = 0;
    }

    else if(codigoPais == 2){
        imposto = 15;
    }

    else{
        imposto = 25;
    }

    float precoSemImposto, valorImposto, precoFinal;

    pesoGrama = pesoKilo *1000;
    precoSemImposto = pesoGrama * precoGrama;
    valorImposto = precoSemImposto * imposto / 100;
    precoFinal = precoSemImposto + valorImposto;

    System.out.println("Peso em gramas: " + pesoGrama);
    System.out.println("Preço do produto sem imposto: " + precoSemImposto);
    System.out.println("Valor do imposto: " + valorImposto);
    System.out.println("Preço Final: " + precoFinal);


    }
}
