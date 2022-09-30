import java.util.Scanner;

public class Problema0223{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n, somaPositivos = 0, qtdNegativos = 0;
        for(int i = 1; i <= 50; i++){
            System.out.print("Digite o " + i + " número: ");
            n = Integer.valueOf(input.nextLine());
            if(n >= 0)
                somaPositivos += n;
            else
                qtdNegativos++;
        }
        System.out.println("Soma dos Positivos: " + somaPositivos);
        System.out.println("Quantidade de Negativos: " + qtdNegativos);
    }
}