import java.util.Scanner;

public class Problema0054 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double valorGasto, valorTotal;

        System.out.print("Digite o valor gasto: ");
        valorGasto = Double.parseDouble(input.nextLine());
        
        valorTotal = valorGasto*1.1;

        System.out.println("O valor total: "+valorTotal );
    }
}    