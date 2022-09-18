import java.util.Scanner;

public class problema0068{

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int quantidadePrestacoes, quantidadePrestacoesPagas;
        float valorPrestacao, valorPago, saldoDevedor;
        System.out.print("Digite a quantidade total de prestações: ");
        quantidadePrestacoes = Integer.valueOf(input.nextLine());
        System.out.print("Digite a quantidade de prestações já pagas: ");
        quantidadePrestacoesPagas = Integer.valueOf(input.nextLine());
        System.out.println("Digite o valor da prestação atual: ");
        valorPrestacao = Float.valueOf(input.nextLine());
        valorPago = quantidadePrestacoesPagas * valorPrestacao;
        saldoDevedor = (quantidadePrestacoes * valorPrestacao) - valorPago;
        System.out.println("O total pago pelo consorciado até agora é: "+valorPago);
        System.out.println("O saldo devedor é: "+saldoDevedor);
    }
}