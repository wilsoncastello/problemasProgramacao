import java.util.Scanner;

public class Problema0008 {
    static Scanner input = new Scanner(System.in);
   
    public static void main(String[] args){
        //Entrada
        float deposito, txJuros, rendimento, valorTotal;
        System.out.println("Digite um valor de depósito: ");
        deposito = Float.valueOf(input.nextLine());
        System.out.println("Digite o valor da taxa de juros(%): ");
        txJuros = Float.valueOf(input.nextLine());
        
        //Processamento
        rendimento = deposito*(txJuros/100);
        valorTotal = deposito+rendimento;

        //Saída
        System.out.println("O rendimento foi de: R$"+rendimento);
        System.out.println("O valor total depois do rendimento é: R$"+valorTotal);
    }
}