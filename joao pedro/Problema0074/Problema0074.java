

import java.util.Scanner;



public class Problema0074 {
    public static void main(String[] args) {
        double dolar=0,real=0,cota=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Conversor de dolar para real. Digite a cotacao do dolar: ");
        cota=Double.valueOf(input.nextLine());
        System.out.println("Digite a quantidade de dolares: ");
        dolar=Double.valueOf(input.nextLine());
        real=dolar*cota;
        System.out.println("Valor em reais: "+real);


    }
}
