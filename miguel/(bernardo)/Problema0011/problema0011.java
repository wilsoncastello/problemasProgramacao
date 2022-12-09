import java.util.Scanner;

public class problema0011 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        int ano;
        int nascimento;
        int idade;
        int idadeFutura;

        // Entrada de valores
        System.out.println("Digite o ano atual: ");
        ano = Integer.valueOf(input.nextLine());
        System.out.println("Digite o segundo número: ");
        nascimento = Integer.valueOf(input.nextLine());

        // Cálculo da idade e da idade em 2050
        idade = ano - nascimento;
        idadeFutura = 2050 - nascimento;

        // Saída
        System.out.println("A idade da pessoa é: " + idade);
        System.out.println("A idade da pessoa em 2050 será: " + idadeFutura);
    }
}
