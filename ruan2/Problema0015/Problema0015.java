import java.util.Scanner;

public class Problema0015{

    /*Um trabalhador recebeu seu salário e o depositou em sua conta 
    bancária. Esse trabalhador emitiu dois cheques e agora deseja 
    saber seu saldo atual. Sabe-se que cada operação bancária de 
    retirada paga CPMF de 0,38% e o saldo inicial da conta está 
    zerado. Faça um programa que leia o valor do salário e dos 
    dois cheques emitidos, calcule e aprensente o saldo atual da conta.*/

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float sal;
        float valCheque1, valCheque2;
        float valTotalcheque1, valTotalcheque2;
        float saldo;

        //Entrada de dados
        System.out.print("Digite o valor do seu salário: ");
        sal = Float.valueOf(input.nextLine());
        System.out.print("Digite o valor do primeiro cheque: ");
        valCheque1 = Float.valueOf(input.nextLine());
        System.out.print("Digite o valor do segundo cheque: ");
        valCheque2 = Float.valueOf(input.nextLine());

        //Processamento
        valTotalcheque1 = ((38*valCheque1)/100) + valCheque1;
        valTotalcheque2 = ((38*valCheque2)/100) + valCheque2;
        saldo = sal - valTotalcheque2 - valTotalcheque1;

        //Saída de dados
        System.out.println();
        System.out.println("Saldo atual: "+saldo);
    }
}