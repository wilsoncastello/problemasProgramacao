import java.util.Scanner;

public class Problema0450 {

    public static double funcao(double x1, double x2, String simbolo) {
        if (simbolo.equals("+")) {
            return x1 + x2;

        } else {
            if (simbolo.equals("-")) {
                return x1 - x2;
            } else {
                if (simbolo.equals("*")) {
                    return x1 * x2;
                }
                if (simbolo.equals("/")) {
                    return x1 / x2;

                } else {
                    return 0;
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
         * Faça um programa contendo uma função que receba dois valores numéricos e um
         * símbolo (+, -, * e /).
         * Esse símbolo representará a operação que se deseja efetuar com os números. O
         * programa deve possibilitar
         * que o usuário faça vários cálculos, sendo terminado quando o usuário digitar
         * # como símbolo.
         */

        String simbolo = "";
        double x1, x2;
        while (!simbolo.equals("#")) {
            System.out.println("Digite dois numeros: ");
            x1 = Double.valueOf(input.nextLine());
            x2 = Double.valueOf(input.nextLine());
            System.out.println(
                    "Digite '+' para somar, '-' para subtrair, '*' para multiplicar, '/' para dividir ou '#' para finalizar o processo: ");
            simbolo = input.nextLine();
            funcao(x1, x2, simbolo);
            if (!simbolo.equals("#")) {
                System.out.println("Resultado: " + funcao(x1, x2, simbolo));
            } else {
                System.out.println("--Finalizando programa--");
            }
        }
    }
}
