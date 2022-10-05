import java.util.Scanner;

public class Problema0195 {
    public static void main(String[] args) {
        int x = 0;
        double numero = 0, maiorNumero = Integer.MIN_VALUE, menorNumero =Integer.MAX_VALUE;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de numeros que deseja digitar: ");
        x = Integer.valueOf(input.nextLine());
        for (int i = 0; i < x; i++) {
            System.out.println("Digite o valor para o " + i + " numero: ");
            numero = Double.valueOf(input.nextLine());
            if (numero > maiorNumero) {
                maiorNumero = numero;
            } 
                if (numero < menorNumero) {
                    menorNumero = numero;
                }
            

        }
        System.out.println("Maior numero: "+maiorNumero);
        System.out.println("Menor numero: "+menorNumero);
    }
}
