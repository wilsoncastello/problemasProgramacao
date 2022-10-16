package raphael.Problema0229;

import java.util.Scanner;

public class Problema0229 {

    /* Uma empresa de vendas possui quinze vendedores viajantes e, ao final do mês, deseja fazer uma análise de suas vendas. Para tanto, para cada vendedor a empresa tem as seguintes informações: tempo de serviço (em anos), valor de suas vendas, total de despesas com viagem. O tempo de serviço é especificado por um código, conforme a seguir.•Acima de 10 anos (A)  •Entre 5 e 10 anos (inclusive extremos)(B)  • Menos que 5 anos (C). Crie um algoritmo que leia os dados e forneça:  a ) A faixa de tempo de serviço que apresenta maior despesa com viagem ; b ) A média de vendas dos vendedores que possuem menos de cinco anos de serviço ; c ) A diferença entre o valor das vendas e despesas com viagem dos vendedores que tem mais de dez anos de serviço ; d ) O total de despesas com viagem pagos pela empresa . */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        char tempoServ, faixa='0';
        float vendas, despesas, maiorDespesa=0, somador=0, media, diferenca=0, totalDespesas=0;
        int contador=0;

        for (int i=0;i<15;i++) {

            System.out.println("\nPara o "+(i+1)+"º vendedor \n \n Digite o tempo de serviço conforme: \n \n * Acima de 10 anos (A) \n * Entre 5 e 10 anos (B) \n * Menos que 5 anos (C)");
            tempoServ = input.nextLine().charAt(0);

            System.out.println("Digite o valor de suas vendas: ");
            vendas = Float.valueOf(input.nextLine());

            System.out.println("Digite o total de despesas com a viagem: ");
            despesas = Float.valueOf(input.nextLine());
            
            totalDespesas = totalDespesas + despesas;

            if (despesas > maiorDespesa) {
                maiorDespesa = despesas;
                faixa = tempoServ;
            }

            if (tempoServ == 'C') {
                somador = somador + vendas;
                contador++;
            }

            if (tempoServ == 'A') {
                diferenca = diferenca + (vendas - despesas);
            }

        }

        media = somador / contador;

        System.out.println("\nA faixa de tempo de serviço que apresenta maior despesa com viagem: "+faixa+"\n\nA media de vendas dos vendedores que tem menos que 5 anos de serviço é: "+media+"\n\nA diferença entre o valor das vendas e despesas com viagem dos vendedores que tem mais de dez anos de serviço é: "+diferenca+"\n\nO total de despesas com viagem pagos pela empresa é: "+totalDespesas);

    }

}