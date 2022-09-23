package stephanie.Problema0095;

import java.util.Scanner;

public class Problema0095 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int n = Integer.valueOf(input.nextLine());
        
        switch (n){
            case 0: System.out.print("Zero");
            break;
            case 1: System.out.print("Um");
            break;
            case 2: System.out.print("Dois");
            break;
            case 3: System.out.print("Três");
            break;
            case 4: System.out.print("Quatro");
            break;
            case 5: System.out.print("Cinco");
            break;
            case 6: System.out.print("Seis");
            break;
            case 7: System.out.print("Sete");
            break;
            case 8: System.out.print("Oito");
            break;
            case 9: System.out.print("Nove");
            break;
            default: System.out.print("Entrada Inválida!");
            break;
        }
        
    }
}
