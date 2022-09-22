import java.util.Scanner;

public class problema0069{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double graus, minutos, segundos, res;
         

        System.out.print("Digite os graus: ");
        graus = Double.parseDouble(input.nextLine());

        System.out.print("Digite os minutos: ");
        minutos = Double.parseDouble(input.nextLine());

        System.out.print("Digite os segundos: ");
        segundos = Double.parseDouble(input.nextLine());

        res = graus + (minutos + segundos/60)/60;

        res = res * (Math.PI/180);

        System.out.println("Esse ângulo em radianos é: "+res);

    }
}