import java.util.Scanner;

public class problema0157 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        int idade;
        int grupo;
        float peso;

        // Entrada de valores
        System.out.println("Digite a idade: ");
        idade = Integer.valueOf(input.nextLine());
        System.out.println("Digite o peso: ");
        peso = Float.valueOf(input.nextLine());

        // Verificação do grupo
        grupo = 9;
        if (idade >= 20) {
            grupo -= 3;
            if (idade > 50) {
                grupo -= 3;
            }
        }
        if (peso >= 60) {
            grupo -= 1;
            if (peso > 90) {
                grupo -= 1;
            }
        }

        // Saída
        System.out.println("O grupo de risco da pessoa é: " + grupo);
    }
}
