package Problema0153;

import java.util.Scanner;
public class problema0153 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o preço do produto: ");
        double preco = Double.valueOf(input.nextLine());
        double taxa;

        if(preco < 50){
            preco = preco + preco*0.05;
            System.out.println("Novo preço: R$" + preco);
        }else if(preco >= 50 && preco <= 100){
            preco = preco + preco*0.1;
            System.out.println("Novo preço: R$" + preco);            
        }else{
            preco = preco + preco*0.15;
            System.out.println("Novo preço: R$" + preco);            
        }

        if(preco < 80)
            System.out.println("Classificação: Barato");
        else if(preco >= 80 && preco <= 120)
            System.out.println("Classificação: Normal");  
        else if(preco > 120 && preco <= 200)
            System.out.println("Classificação: Caro");
        else
            System.out.println("Classificação: Muito Caro");      
    }
}
