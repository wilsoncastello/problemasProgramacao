import java.util.Scanner;

public class problema0020{

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float salarioMinimo, valorQuilowatt, valorConta;
        int quantidadeQuilowatts;
        double valorContaMulta;
        System.out.print("Digite o valor do salário mínimo: ");
        salarioMinimo = Float.valueOf(input.nextLine());
        System.out.print("Digite a quantidade de quilowatts consumidos: ");
        quantidadeQuilowatts = Integer.valueOf(input.nextLine());
        valorQuilowatt = salarioMinimo / 5;
        valorConta = quantidadeQuilowatts * valorQuilowatt;
        valorContaMulta = valorConta * 1.15;
        System.out.println("O valor de cada quilowatts consumido é: "+valorQuilowatt);
        System.out.println("O valor da conta de luz a ser pago por essa residência é: "+valorConta);
        System.out.println("O valor da conta de luz a ser pago com multa de 15% por essa residência é: "+valorContaMulta);
    }
}