import java.util.Scanner;

public class problema0135 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        int idade;
        float peso;
        float mg;
        float gotas;

        // Entrada de valores
        System.out.println("Digite a idade: ");
        idade = Integer.valueOf(input.nextLine());
        System.out.println("Digite o peso: ");
        peso = Float.valueOf(input.nextLine());

        // Cálculo da dosagem
        if (idade >= 12) {
            if (peso >= 60) {
                mg = 1000;
            } else {
                mg = 875;
            }
        } else {
            if (peso <= 9) {
                mg = 125;
            } else if (peso <= 16) {
                mg = 250;
            } else if (peso <= 24) {
                mg = 375;
            } else if (peso <= 30) {
                mg = 500;
            } else {
                mg = 750;
            }
        }

        gotas = (mg / 500) * 20;

        // Saída
        System.out.println("O paciente deve tomar: " + gotas + " gotas");
    }
}