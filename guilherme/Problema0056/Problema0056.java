import java.util.Scanner;
import java.lang.Math;

public class Problema0056{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        //Entrada
        double p, i, valorAcumulado;
        int n;
        System.out.print("Digite o valor constante da aplicação mensal: ");
        p = Double.valueOf(input.nextLine());
        System.out.print("Digite o valor da taxa: ");
        i = Double.valueOf(input.nextLine());
        System.out.print("Digite o número de meses: ");
        n = Integer.valueOf(input.nextLine());

        //Processamento
        valorAcumulado = (p * Math.pow((1 + i), n) - 1) / i;
                
        //Saída
        System.out.println("O rendimento será de: " + valorAcumulado);
    }
}