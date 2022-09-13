package raphael.Problema0062;

import java.util.Scanner;

public class Problema0062 {

    /* Uma pessoa comprou quatro artigos em uma loja. Para cada artigo, tem-se o nome, preço e percentual de desconto. Faça um algoritmo que imprima nome, preço e preço com desconto de cada artigo. Imprima também o total a pagar. */

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        String nome1, nome2, nome3, nome4;
        float pr1, pr2, pr3, pr4, dc1, dc2, dc3, dc4, prdc1, prdc2, prdc3, prdc4, totalPagar;
        
        System.out.println("Digite o nome do primeiro artigo: ");
        nome1 = input.nextLine();
        System.out.println("Digite o preço do primeiro artigo: ");
        pr1 = Float.valueOf(input.nextLine());
        System.out.println("Digite o desconto do primeiro artigo (em porcentagem): ");
        dc1 = Float.valueOf(input.nextLine());
        
        System.out.println("Digite o nome do segundo artigo: ");
        nome2 = input.nextLine();
        System.out.println("Digite o preço do segundo artigo: ");
        pr2 = Float.valueOf(input.nextLine());
        System.out.println("Digite o desconto do segundo artigo (em porcentagem): ");
        dc2 = Float.valueOf(input.nextLine());
        
        System.out.println("Digite o nome do terceiro artigo: ");
        nome3 = input.nextLine();
        System.out.println("Digite o preço do terceiro artigo: ");
        pr3 = Float.valueOf(input.nextLine());
        System.out.println("Digite o desconto do terceiro artigo (em porcentagem): ");
        dc3 = Float.valueOf(input.nextLine());
        
        System.out.println("Digite o nome do quarto artigo: ");
        nome4 = input.nextLine();
        System.out.println("Digite o preço do quarto artigo: ");
        pr4 = Float.valueOf(input.nextLine());
        System.out.println("Digite o desconto do quarto artigo (em porcentagem): ");
        dc4 = Float.valueOf(input.nextLine());
        
        prdc1 = pr1 - ((dc1 / 100) * pr1);
        prdc2 = pr2 - ((dc2 / 100) * pr2);
        prdc3 = pr3 - ((dc3 / 100) * pr3);
        prdc4 = pr4 - ((dc4 / 100) * pr4);
        
        totalPagar = prdc1 + prdc2 + prdc3 + prdc4;
        
        System.out.println("Nome do primeiro artigo: "+ nome1);
        System.out.println("Preço: "+pr1);
        System.out.println("Preço com desconto: "+prdc1);
        
        System.out.println("Nome do primeiro artigo: "+ nome2);
        System.out.println("Preço: "+pr2);
        System.out.println("Preço com desconto: "+prdc2);
        
        System.out.println("Nome do primeiro artigo: "+ nome3);
        System.out.println("Preço: "+pr3);
        System.out.println("Preço com desconto: "+prdc3);
        
        System.out.println("Nome do primeiro artigo: "+ nome4);
        System.out.println("Preço: "+pr4);
        System.out.println("Preço com desconto: "+prdc4);
        
        System.out.println("Total a pagar: "+totalPagar);

    }
    
}
