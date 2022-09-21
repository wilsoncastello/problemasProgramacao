import java.util.Scanner;

public class problema0065 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        float picole1;
        float picole2;
        float picole3;
        float quantidade;
        float total;
 
        
        //Entrada de valores
        System.out.println("Digite o número de picolés do tipo 1 vendidos: ");
        picole1 = Float.valueOf(input.nextLine());
        System.out.println("Digite o número de picolés do tipo 2 vendidos: ");
        picole2 = Float.valueOf(input.nextLine());
        System.out.println("Digite o número de picolés do tipo 3 vendidos: ");
        picole3 = Float.valueOf(input.nextLine());
        
        //Cálculo da quantidade e valor total dos picolés
        quantidade = picole1 + picole2 + picole3;
        total = (float)(picole1 * 1.5 + picole2 * 2 + picole3 * 0.75);

        //Saída 
        System.out.println("Quantidade vendida: " + quantidade);
        System.out.println("Valor arrecadado: R$" + Math.round(total * 100d) / 100d);
    }
}
