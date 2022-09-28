import java.util.Scanner;

public class problema0187 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        float[] numeros  = new float[15];
        float raizQuadrada;

        // Entrada de valores
            for (int i = 0; i < 15; i++) {
                System.out.println("Digite o " + (i + 1) + " número: ");
                numeros[i] = Float.valueOf(input.nextLine());
            }
        

        // Saída e Cálculo da raíz quadrada
        for (int i = 0; i < 15; i++) {
             raizQuadrada = (float)Math.sqrt(numeros[i]);
            System.out.println("A raíz quadrada de " + numeros[i] + " é: " + raizQuadrada);
        }

    }
}
