import java.util.Scanner;

public class Problema0047{

    /*Faça um programa que leia os valores dos catetos de um triângulo retângulo e imprimir a hipotenusa*/

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float catAd, catOp;
        double hip;

        //Entrada de dados
        System.out.print("Digite o valor do cateto Adjacente: ");
        catAd = Float.valueOf(input.nextLine());
        System.out.print("Digite o valor do cateto Oposto: ");
        catOp = Float.valueOf(input.nextLine());

        //Processamento
        hip = Math.sqrt(Math.pow(catAd, 2) + Math.pow(catOp, 2));

        //Saída de dados
        System.out.print("O valor da hipotenusa do triangulo: "+hip);

    }
}