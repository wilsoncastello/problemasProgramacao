package problemasProgramacao.cristopher.Problema0158;

import java.util.Scanner;

public class problema0158 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o código do produto (1 a 40): ");
        int codigo = Integer.valueOf(input.nextLine());

        System.out.print("Digite a quantidade que comprou deste produto: ");
        int qtdProduto = Integer.valueOf(input.nextLine());

        float preco = 0;
        if(codigo >= 1 && codigo <=10){
            preco = 10.0f;
            System.out.println("Preço unitário: " + preco);
        }else if(codigo > 10 && codigo <= 20){
            preco = 15.0f;
            System.out.println("Preço unitário: " + preco);
        }else if(codigo > 20 && codigo <= 30){
            preco = 20.0f;
            System.out.println("Preço unitário: " + preco);
        }else{
            preco = 30.0f;
            System.out.println("Preço unitário: " + preco);
        }               

        float precoTotal = preco * qtdProduto;
        System.out.println("Preço total da nota: " + precoTotal);

        float precoDesconto = 0;
        if(precoTotal <= 250){
            precoDesconto = precoTotal * 5/100;
        }else if(precoTotal > 250 && precoTotal <= 500){
            precoDesconto = precoTotal * 10/100;
        }else{
            precoDesconto = precoTotal * 15/100;
        }

        float totalFinal = precoTotal - precoDesconto;

        System.out.println("Valor do desconto em si: " + precoDesconto);
        System.out.println("Valor total da nota com desconto: " + totalFinal);






        input.close();
        
    }
    
}
