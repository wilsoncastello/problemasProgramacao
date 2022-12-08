import java.util.Scanner;

public class problema0211 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        String ingresso;
        int socio = 0;
        int naoSocio = 0;
        float percentual = 0;
        int ingressos;
        int valorSocios;
        int valorNaoSocios;
        int valorTotal;

        // Entrada de valores e contagem de ingressos
        for (var i = 0; i < 10; i++) {
            System.out.println(
                    "Digite o tipo do " + (i + 1) + " ingresso(socio ou nao-socio) ou digite fim para finalizar: ");
            ingresso = String.valueOf(input.nextLine());
            if (ingresso.toLowerCase().equals("socio")) {
                socio++;
            } else if (ingresso.toLowerCase().equals("nao-socio")) {
                naoSocio++;
            } else if (ingresso.toLowerCase().equals("fim")) {
                break;
            } else {
                System.out.println("Entrada " + ingresso + " não é reconhecida");
                break;
            }
        }

        // Cálculos
        percentual = 0;
        ingressos = socio + naoSocio;
        if (ingressos > 0) {
            percentual = (socio * 100) / ingressos;
        }
        valorSocios = 50 * socio;
        valorNaoSocios = 100 * naoSocio;
        valorTotal = valorSocios + valorNaoSocios;

        // Saída
        System.out.println("A quantidade de ingressos para sócios é: " + socio);
        System.out.println("A quantidade de ingressos para não_sócios é: " + naoSocio);
        System.out.println("O percentual de ingressos para sócios é: " + percentual + "%");
        System.out.println("O valor recebido de sócios é: R$" + Math.round(valorSocios * 100) / 100);
        System.out.println("O valor recebido de não-sócios é: R$ " + Math.round(valorNaoSocios * 100) / 100);
        System.out.println("O valor total recebido é: R$" + Math.round(valorTotal * 100) / 100);
    }
}