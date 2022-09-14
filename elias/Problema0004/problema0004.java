

import java.util.Scanner;

public class problema0004 {

    public static void main(String[] args) {

    Scanner input = new Scanner (System.in);

        float altura, base, area;
        System.out.println("Digite a altura do triangulo:");
        altura = Float.valueOf(input.nextLine());
        System.out.println("Digite a base do triangulo:");
        base = Float.valueOf(input.nextLine());
        area = (altura * base) /2;
        System.out.println("A area do triangulo é: "+area);
    }
}