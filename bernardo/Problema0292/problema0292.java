import java.util.Scanner;

public class problema0247 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        float lista[] = new float[10];
        float valor;
        int tamanho = 10;
        int numeros = 0;
        int quantidade = 0;

        // Entrada de valores
        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o " + (i + 1) + " número (digite 0 para finalizar): ");
            valor = Float.valueOf(input.nextLine());
            if (valor == 0) {
                break;
            } else {
                lista[i] = valor;
                numeros++;
            }
        }

        // Cálculo da quantidade de números
        for (var i = 0; i < numeros; i++) {
            if (lista[i] == lista[numeros - 1]) {
                quantidade++;
            }
        }

        // Saída
        System.out.println("Quantidade de " + lista[numeros - 1] + " digitados: " + quantidade);
    }
}
