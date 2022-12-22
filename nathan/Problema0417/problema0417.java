package Problema0417;

import java.util.Scanner;

public class problema0417 {

    static double converterRad(double graus){
        return graus * (3.14/180);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o valor em graus para a conversão em radianos: ");
        double graus = Double.valueOf(input.nextLine());

        double rad = converterRad(graus);
        System.out.println("Radianos: " + rad);
    }
}
