import java.util.Scanner;

/*Elaborar um programa que calcule uma raiz de base qualquer com índice qualquer */

public class Problema0079{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double base, indice, num;

        //Entrada de dados
        System.out.print("Digite o valor da base: ");
        base = Double.valueOf(input.nextLine());
        System.out.print("Digite o valor do índice: ");
        indice = Double.valueOf(input.nextLine());

        //Processamento 
        num = Math.pow(base, indice);

        //Saída de dados
        System.out.println("O valor da operação é: "+num);
    }
}