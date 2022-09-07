package problemasProgramacao.cristopher.Problema0067;

import java.util.Scanner;

public class problema0067 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o seu nome: ");
        String nome = input.nextLine();
                
        System.out.print("Digite quantas porcas você comprou: ");
        int qtdPorcas = Integer.valueOf(input.nextLine());
        System.out.print("Agora, digite o preço unitário da porca: R$ ");
        float precoPorca = Float.valueOf(input.nextLine());
        
        System.out.print("Digite a quantidade de parafusos: ");
        int qtdParafusos = Integer.valueOf(input.nextLine());
        System.out.print("Agora, digite o preço unitário do parafuso: R$ ");
        float precoParafuso = Float.valueOf(input.nextLine());
        
        System.out.print("Digite a quantidade de arruelas: ");
        int qtdArruelas = Integer.valueOf(input.nextLine());
        System.out.print("Agora, digite o preço unitário da arruela: R$ ");
        float precoArruela = Float.valueOf(input.nextLine());
        
        float valorBruto, valorFinal, descontoParafuso, descontoArruela, descontoPorca, valorDesconto;
        
        valorBruto = (precoPorca * qtdPorcas) + (precoParafuso * qtdParafusos) + (precoArruela * qtdArruelas);
        
        descontoPorca = (precoPorca * qtdPorcas) * 10/100;
        descontoArruela = (precoArruela * qtdArruelas) * 30/100;
        descontoParafuso = (precoParafuso * qtdParafusos) * 20/100;
        
        valorDesconto = descontoPorca + descontoArruela + descontoParafuso;
        
        valorFinal = valorBruto - valorDesconto;
        
        System.out.println(nome + ", você comprou " + qtdPorcas + " porcas, " + qtdParafusos + " parafusos e " + qtdArruelas + " arruelas.");
        System.out.println("O valor bruto é de R$ " + valorBruto);
        System.out.println("O valor do desconto é de R$ " + valorDesconto);
        System.out.println("O valor final a ser pago é de R$ " + valorFinal);
        
        input.close();
    }
    
}
