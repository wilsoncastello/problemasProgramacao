import java.util.Scanner;

public class Problema0040 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        //Entrada
        double n, terco;
        System.out.print("Digite um número real: ");
        n = Double.valueOf(input.nextLine());

        //Processamento
        terco = n / 3;

        //Saída
        System.out.println("A terça parte de: " + n + " é: " + terco);
    }
}