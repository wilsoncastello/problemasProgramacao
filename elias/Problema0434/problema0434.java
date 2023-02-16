import java.util.Scanner;

public class problema0434 {

    public static int calculaResultado(int A, int B, int C){
        int soma = A + B + C;
        int resultado = soma * soma;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int A, B, C;
        System.out.println("Digite um número inteiro para A:");
        A = Integer.valueOf(input.nextLine());
        System.out.println("Digite um número inteiro para B:");
        B = Integer.valueOf(input.nextLine());
        System.out.println("Digite um número inteiro para C:");
        C = Integer.valueOf(input.nextLine());
        int resultado = calculaResultado(A, B, C);
        System.out.println("O quadrado da soma dos três valores é: "+resultado);
    }
}