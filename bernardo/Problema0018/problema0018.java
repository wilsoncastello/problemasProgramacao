import java.util.Scanner;

public class problema0018 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        float altura;
        int degraus;
        float resto;
        int exatidao;
        float ultimoDegrau;

        // Entrada de valores
        System.out.println("Digite a altura a ser alcançada(em metros): ");
        altura = Float.valueOf(input.nextLine());

        // Cálculo do número de degraus
        altura = altura * 100;
        degraus = (int)(altura / 17);
        resto = altura % 17;
        exatidao =(int)((resto + 2) / (resto + 1));
        degraus += 2 - exatidao;
        ultimoDegrau = (exatidao - 1) * 17 + resto;

        // Saída 
        System.out.println("Número de degraus: " + degraus);
        System.out.printf("Altura pertencente ao último degrau: %.2f",ultimoDegrau);
    }
}
