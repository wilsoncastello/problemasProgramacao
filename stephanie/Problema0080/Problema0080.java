package stephanie.Problema0080;

import java.util.Scanner;

public class Problema0080 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    
        System.out.print("Digite a temperatura em Fahrenheit: ");
        double f = Double.valueOf(input.nextLine());
        double c = ((f - 32)*5)/9;
        System.out.print("Temperatura em Celsius: "+c);
    }
}
