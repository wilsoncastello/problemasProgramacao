package Problema0122;
import java.util.Scanner;

public class problema0122 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor em reais a ser convertido: ");
        double valor = Double.valueOf(input.nextLine());
        System.out.println("Digite o código da moeda a ser convertido(L-Libra, D-Dolar, E-Euro): ");
        char codigo = input.nextLine().charAt(0);

        double valorConvertido = 0;

        if(codigo =='L'){
            valorConvertido = valor * 0.17;
            System.out.println("Valor informado: " + valor);
            System.out.println("Valor convertido em " + codigo + ": " + valorConvertido);
        }else if(codigo == 'D'){
            valorConvertido = valor * 0.19;
            System.out.println("Valor informado: " + valor);
            System.out.println("Valor convertido em " + codigo + ": " + valorConvertido);
        }else if(codigo == 'E'){
            valorConvertido = valor * 0.19;
            System.out.println("Valor informado: " + valor);
            System.out.println("Valor convertido em " + codigo + ": " + valorConvertido);
        }else{
            System.out.println("Codigo invalido");
        }
    }
}
