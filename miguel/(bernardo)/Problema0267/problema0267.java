import java.util.Scanner;

public class problema0267 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de iáveis
        int conta[] = new int[10];
        float saldo[] = new float[10];
        int codigo;
        boolean executando;
        boolean contido;
        int opcao;
        int indice = 0;
        float saque;
        float deposito;
        float ativo;

        // Entrada de valores
        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o código da " + (i + 1) + " conta: ");
            codigo = Integer.valueOf(input.nextLine());
            contido = false;
            for (int j = 0; j < i; j++) {
                if (conta[j] == codigo) {
                    contido = true;
                }
            }
            if (contido) {
                System.out.println("Código já cadastrado");
                i--;
            } else {
                conta[i] = codigo;
                System.out.println("Digite o saldo: ");
                saldo[i] = Float.valueOf(input.nextLine());
            }
        }

        // Aplicação do menu
        executando = true;
        System.out.println("Menu de Opções");
        while (executando) {
            System.out.println(
                    "1. Efetuar depósito" +
                            "\n2. Efetuar saque" +
                            "\n3. Consultar saldo" +
                            "\n4. Consultar o ativo bancário" +
                            "\n5. Finalizar o programa");
            System.out.println("Digite o número da opção desejada: ");
            opcao = Integer.valueOf(input.nextLine());
            switch (opcao) {
                case 1:
                    System.out.println("Digite o código da conta: ");
                    codigo = Integer.valueOf(input.nextLine());
                    System.out.println("Digite o valor de depósito: ");
                    deposito = Float.valueOf(input.nextLine());
                    contido = false;
                    for (int i = 0; i < 10; i++) {
                        if (conta[i] == codigo) {
                            indice = i;
                            contido = true;
                        }
                    }
                    if (contido) {
                        saldo[indice] += deposito;
                    } else {
                        System.out.println("Conta não encontrada");
                    }
                    break;
                case 2:
                    System.out.println("Digite o código da conta: ");
                    codigo = Integer.valueOf(input.nextLine());
                    System.out.println("Digite o valor de saque: ");
                    saque = Float.valueOf(input.nextLine());
                    contido = false;
                    for (int i = 0; i < 10; i++) {
                        if (conta[i] == codigo) {
                            indice = i;
                            contido = true;
                        }
                    }
                    if (contido) {
                        if (saldo[indice] - saque >= 0) {
                            saldo[indice] -= saque;
                        } else {
                            System.out.println("Saldo insuficiente");
                        }
                    } else {
                        System.out.println("Conta não encontrada");
                    }
                    break;
                case 3:
                    System.out.println("Digite o código da conta: ");
                    codigo = Integer.valueOf(input.nextLine());
                    contido = false;
                    for (int i = 0; i < 10; i++) {
                        if (conta[i] == codigo) {
                            indice = i;
                            contido = true;
                        }
                    }
                    if (contido) {
                        System.out.println("O saldo da conta é: R$" + Math.round(saldo[indice] * 100) / 100);
                    } else {
                        System.out.println("Conta não encontrada");
                    }
                    break;
                case 4:
                    ativo = 0;
                    for (int i = 0; i < 10; i++) {
                        ativo += saldo[i];
                    }
                    System.out.println("Ativo bancário: R$" + Math.round(ativo * 100) / 100);
                    break;
                case 5:
                    executando = false;
                    System.out.println("Operação finalizada");
                    break;
                default:
                    System.out.println("Opção não reconhecida");
            }
        }
    }
}