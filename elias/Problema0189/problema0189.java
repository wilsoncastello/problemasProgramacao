import java.util.Scanner;

public class problema0189 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);      
        int limiteSuperior, limiteInferior, decremento;
        float grausCelsius, grausFahrenheit;
        System.out.println("Digite o limite inferior:");
        limiteInferior = Integer.valueOf(input.nextLine());
        System.out.println("Digite o limite superior:");
        limiteSuperior = Integer.valueOf(input.nextLine());
        System.out.println("Digite o valor do decremento:");
        decremento = Integer.valueOf(input.nextLine());
        for (grausCelsius = limiteSuperior; grausCelsius > limiteInferior; grausCelsius = grausCelsius - decremento){
            grausFahrenheit = (grausCelsius * 9 / 5) + 32;
            System.out.println("Graus Celsius: "+grausCelsius+"             Graus Fahrenheit: "+grausFahrenheit);  
        }
    }
}