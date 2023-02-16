import java.util.Scanner;

public class problema0105 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        int opcao;
        float numero1;
        float numero2;
        float resultado;

        // Entrada de valores
        System.out.println("Menu de opções: \n1. Somar dois números. \n2. Raiz quadrada de um número.");
        System.out.println("Digite a opção desejada: ");
        opcao = Integer.valueOf(input.nextLine());

        // Cálculo das operações
        if (opcao == 1) {
            System.out.println("Digite o primeiro número: ");
            numero1 = Integer.valueOf(input.nextLine());
            System.out.println("Digite o segundo número: ");
            numero2 = Integer.valueOf(input.nextLine());
            resultado = numero1 + numero2;
        } else if (opcao == 2) {
            System.out.println("Digite um número: ");
            numero1 = Integer.valueOf(input.nextLine());
            resultado = (float) (Math.sqrt(numero1));
        } else {
            System.out.println("Operação não reconhecida");
            resultado = 0;
        }

        // Saída
        System.out.println("O resultado da operação é: " + resultado);
    }
}