import java.util.Scanner;

public class problema0050 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        float altura;
        float raio;
        float area;
        float volume;

        // Entrada de valores
        System.out.println("Digite a altura da lata (em centímetros): ");
        altura = Float.valueOf(input.nextLine());
        System.out.println("Digite o raio da lata (em centímetros): ");
        raio = Float.valueOf(input.nextLine());

        // Cálculo do termo da PG
        area = (float) (Math.PI * Math.pow(raio, 2));
        volume = area * altura;

        // Saída
        System.out.println("O volume da lata é: " + (int)volume + "ml");
    }
}
