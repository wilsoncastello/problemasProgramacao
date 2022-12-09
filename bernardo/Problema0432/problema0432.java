import java.util.Scanner;

public class problema0432 {
    static Scanner input = new Scanner(System.in);

    // Função de alteração da string
    static int alteraString(String mensagem, int tamanho, char caractere) {
        int numero = 0;
        String lista = "";
        for (var i = 0; i < tamanho; i++) {
            if (mensagem.charAt(i) == caractere) {
                lista += '*';
                numero += 1;
            } else {
                lista += mensagem.charAt(i);
            }
        }
        mensagem = lista;
        System.out.println("Mensagem alterada: " + mensagem);
        return numero;
    }

    public static void main(String[] args) {

        // Declaração de variáveis
        String mensagem;
        int tamanho;
        char caractere;
        int numero;

        // Entrada de valores
        System.out.println("Digite a mensagem: ");
        mensagem = String.valueOf(input.nextLine());
        System.out.println("Digite o tamanho: ");
        tamanho = Integer.valueOf(input.nextLine());
        System.out.println("Digite o caractere que deseja ser alterado: ");
        caractere = (String.valueOf(input.nextLine())).charAt(0);

        // Saída e chamada de função
        numero = alteraString(mensagem, tamanho, caractere);
        System.out.println("Númerod de caracteres alterados: " + numero);
    }
}