import java.util.Scanner;

public class problema0160{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o número de horas extras: ");
        double horasExtras = Double.parseDouble(input.next());

        System.out.print("Número de horas faltadas: ");
        double horasFaltadas = Double.parseDouble(input.next());

        double h = horasExtras - 2/3 * horasFaltadas;

        if(h > 2400){
            System.out.println("Gratificação de R$500,00");
        } else {
            if(h > 1800){
                System.out.println("Gratificação de R$400,00");
            } else {
                if(h > 1200){
                    System.out.println("Gratificação de R$300,00");
                } else {
                    if(h > 600){
                        System.out.println("Gratificação de R$200,00");
                    } else {
                        System.out.println("Gratificação de R$100,00");
                    }
                }
            }
        }
    }
}