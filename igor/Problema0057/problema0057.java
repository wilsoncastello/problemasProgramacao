import java.util.Scanner;

public class problema0057{

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Quantidade de Fitas: ");
        int quantidadeFitas = input.nextInt();
        System.out.println("Valor aluguel: ");
        float valorAluguel = input.nextFloat();

        float faturamentoAnual = ((quantidadeFitas/3)*valorAluguel)*12;
        System.out.println("Faturamento Anual: "+faturamentoAnual);

        float totalMultas = (quantidadeFitas/10) * ((valorAluguel * 110)/100);
        System.out.println("Valor ganho por multa ao mes: "+totalMultas);

        
        int reposicao = (quantidadeFitas * 10)/100;
        int fitasEstragadas = (quantidadeFitas  * 2)/100;
        int quantidadeFinal = quantidadeFitas - fitasEstragadas + reposicao;
        System.out.println("Quantidade de fitas final: "+quantidadeFinal);


    }


}