import java.util.Scanner;

public class problema0159 {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    float precoProduto;
    double valorAumento, valorImposto = 0,  novoPreco = 0, valorTotal = 0;
    int categoriaProduto;
    char refrigeracao;
    System.out.println("Digite o preço do produto:");
    precoProduto = Float.valueOf(input.nextLine());
    System.out.println("Digite a categoria do produto (1 — limpeza; 2 — alimentação; ou 3 — vestuário):");
    categoriaProduto = Integer.valueOf(input.nextLine());
    System.out.println("Digite 'R' se o produto necessita de refrigeração, ou 'N' se não necessita:");
    refrigeracao = input.nextLine().charAt(0);
        if(precoProduto <= 25 && categoriaProduto == 1){
            valorAumento = precoProduto * 0.05;
            valorTotal = precoProduto + valorAumento;
            if(refrigeracao == 'R' || refrigeracao == 'r'){
                valorImposto = valorTotal * 0.05;
            }
            else
                valorImposto = valorTotal * 0.08;
        }
        else if(precoProduto <= 25 && categoriaProduto == 2){
            valorAumento = precoProduto * 0.08;
            valorTotal = precoProduto + valorAumento;
            valorImposto = valorTotal * 0.05;
        }
        else if(precoProduto <= 25 && categoriaProduto == 3){
            valorAumento = precoProduto * 0.1;
            valorTotal = precoProduto + valorAumento;
            if(refrigeracao == 'R' || refrigeracao == 'r'){
                valorImposto = valorTotal * 0.05;
            }
            else
                valorImposto = valorTotal * 0.08;
            } 
        else if(precoProduto > 25 && categoriaProduto == 1){
            valorAumento = precoProduto * 0.12;
            valorTotal = precoProduto + valorAumento;
            if(refrigeracao == 'R' || refrigeracao == 'r'){
                valorImposto = valorTotal * 0.05;
            }
            else
                valorImposto = valorTotal * 0.08;
        }   
        else if(precoProduto > 25 && categoriaProduto == 2){
            valorAumento = precoProduto * 0.15;
            valorTotal = precoProduto + valorAumento;
            valorImposto = valorTotal * 0.05;
        }
        else if(precoProduto > 25 && categoriaProduto == 3){
            valorAumento = precoProduto * 0.18;
            valorTotal = precoProduto + valorAumento;
            if(refrigeracao == 'R' || refrigeracao == 'r'){
                valorImposto = valorTotal * 0.05;
            }
            else
                valorImposto = valorTotal * 0.08;
        }
        novoPreco = valorTotal - valorImposto;
        if (novoPreco <= 50){
            System.out.println("O novo preço do produto é "+novoPreco+" e o produto està classificado como barato");
        }
        else if (novoPreco > 50 && novoPreco < 120){
            System.out.println("O novo preço do produto é "+novoPreco+" e o produto està classificado como normal");
        }
        else if (novoPreco >= 120){
            System.out.println("O novo preço do produto é "+novoPreco+" e o produto està classificado como caro");
        }
    }
}