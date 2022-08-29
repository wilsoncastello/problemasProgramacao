import java.util.Scanner;

public class problema0001{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int soma;
        
        //Entrada de valores
        System.out.println("Digite o primeiro número: ");
        numero1 = Integer.valueOf(input.nextLine());
        System.out.println("Digite o segundo número: ");
        numero2 = Integer.valueOf(input.nextLine());
        System.out.println("Digite o terceiro número: ");
        numero3 = Integer.valueOf(input.nextLine());
        System.out.println("Digite o quarto número: ");
        numero4 = Integer.valueOf(input.nextLine());
        
        //Cálculo da soma
        soma = numero1 + numero2 + numero3 + numero4;

        //Saída 
        System.out.println("Soma dos 4 números: " + soma);
    }
}
