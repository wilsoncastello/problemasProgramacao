import java.util.Scanner;

public class Problema0054 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double valorGasto, valorGorjeta, valorTotal;

        System.out.print("Digite o valor gasto: ");
        valorGasto = Double.parseDouble(input.nextLine());
        
        valorGorjeta = valorGasto*0.1;
        valorTotal = valorGasto + valorGorjeta;

        System.out.println("O valor total: "+valorTotal );
    }
}    