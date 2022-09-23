import java.util.Scanner;

public class problema0096 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        int conta;
        float saldo;
        float valor;
        String operacao;

        // Entrada de valores
        System.out.println("Digite o número da conta: ");
        conta = Integer.valueOf(input.nextLine());
        System.out.println("Digite o saldo: ");
        saldo = Float.valueOf(input.nextLine());
        System.out.println("Digite o tipo de operação (depósito ou retirada): ");
        operacao = input.nextLine();
        System.out.println("Digite o valor desejado: ");
        valor = Float.valueOf(input.nextLine());

        // Verificação se o número é par e saída
        if (operacao.equals("depósito") || operacao.equals("deposito")) {
            saldo += valor;
        }
        else if (operacao.equals("retirada")){
           saldo -= valor;
        }
        else {
            System.out.println("Operação não identificada");
        }

        // Saída
        System.out.println("O saldo atual da conta " + conta + " é: R$" + Math.round(saldo * 100d) / 100d);
        if (saldo < 0){
            System.out.println("Conta estourada");
        }
        else{
            System.out.println("Conta regular");
        }
    }
}
