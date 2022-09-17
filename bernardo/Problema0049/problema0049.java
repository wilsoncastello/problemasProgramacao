import java.util.Scanner;

public class problema0049 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        float razao;
        float termo1;
        float posicaoN;
        float termoN;

        // Entrada de valores
        System.out.println("Digite a razão da PG: ");
        razao = Float.valueOf(input.nextLine());
        System.out.println("Digite o primeiro termo: ");
        termo1 = Float.valueOf(input.nextLine());
        System.out.println("Digite a posição desejada: ");
        posicaoN = Float.valueOf(input.nextLine());

        // Cálculo do volume da lata
        termoN = (float) (termo1 * Math.pow(razao, posicaoN - 1));

        // Saída
        System.out.println("O termo" + posicaoN + " é: " + termoN);
    }
}
