import java.util.Scanner;

public class Problema0022 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float custo, preco, quantidadeConvite;

        System.out.print("Digite o custo do espetáculo teatral: ");
        custo = Float.parseFloat(input.nextLine());
        System.out.print("Digite o preço do convite desse espetáculo: ");
        preco = Float.parseFloat(input.nextLine());

        quantidadeConvite = custo/preco;

        System.out.print("Devem ser vendidos "+ quantidadeConvite +" convites para que, pelo menos, o custo do espetáculo seja alcançado.");
    }
}