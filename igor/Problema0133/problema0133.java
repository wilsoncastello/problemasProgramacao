import java.util.Scanner;
public class problema0133 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Escreve o nome do produto");
        String nome = input.nextLine();
        System.out.println("Escreve valor de compra: ");
        float valorCompra = input.nextInt();
    
        float ValorVenda;

       if(valorCompra < 100){
            ValorVenda = (valorCompra * 70)/100;
       }else if(100 <= valorCompra && valorCompra< 300){
            ValorVenda = (valorCompra * 50)/100;
       }else if(300 <= valorCompra && valorCompra< 500){
            ValorVenda = (valorCompra * 40)/100;
       }else{
            ValorVenda = (valorCompra * 30)/100;
       }

       System.out.println("Nome do produto: "+nome);
       System.out.println("Valor da Venda: "+ValorVenda);


    }
}