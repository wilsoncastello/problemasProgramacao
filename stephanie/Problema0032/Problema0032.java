package stephanie.Problema0032;
import java.util.Scanner;

public class Problema0032 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Digite a temperatura em Celsius: ");
    double tempCelsius = Double.valueOf(input.nextLine());
    double tempFahrenheit = 9.0 / 5.0 * tempCelsius + 32;
    System.out.print("Temperatura em Fahrenheit: "+tempFahrenheit);
}
}
