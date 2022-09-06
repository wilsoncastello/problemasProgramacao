import java.util.Scanner;

public class Problema0072{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        //Entrada
        int n, soma = 0, resto;
        System.out.println("Digite um valor inteiro: ");
        n = Integer.valueOf(input.nextLine());

        //Processamento
        resto = n % 10;
        n = n / 10;
        soma = soma + resto;
        resto = n % 10;
        n = n / 10;
        soma = soma + resto;
        resto = n % 10;
        n = n / 10;
        soma = soma + resto;

        //Saída
        System.out.println("A soma dos digitos é igual a: " + soma);
    }
}