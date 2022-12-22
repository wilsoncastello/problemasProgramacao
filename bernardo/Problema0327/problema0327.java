import java.util.Scanner;

public class problema0327 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variávies

        // Entrada de valores
        String[] lista;
        int tamanho = 0;
        int quantidade = 0;

        System.out.println("Digite o número de funcionários da empresa: ");
        tamanho = Integer.valueOf(input.nextLine());

        lista = new String[tamanho];

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite a profissão do " + (i + 1) + " funcionário: ");
            String funcionario = (input.nextLine());
            lista[i] = funcionario;
        }

        // Cálculo da quantidade de dentistas na empresa
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].toLowerCase().equals("dentista")) {
                quantidade++;
            }
        }

        // Saída
        System.out.println("Quantidade de dentistas da empresa: " + quantidade);
    }
}
