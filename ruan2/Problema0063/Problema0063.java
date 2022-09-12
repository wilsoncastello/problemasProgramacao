import java.util.Scanner;

public class Problema0063{

    /*Faça um algoritmo que leia os preços de três mercadorias em 01/04 e 01/05 e 
    tendo como base a variação dos preços dessas mercadorias,
    calcule a taxa de inflação ocorrida neste período. */

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float prod1_0104, prod2_0104, prod3_0104;
        float prod1_0105, prod2_0105, prod3_0105;
        float taxa1, taxa2, taxa3;

        //Entrada de dados
        System.out.println("Digite o Preço dos dias 01/04");
        System.out.print("Preço do primeiro produto: ");
        prod1_0104 = Float.valueOf(input.nextLine());
        System.out.print("Preço do segundo produto: ");
        prod2_0104 = Float.valueOf(input.nextLine());
        System.out.print("Preço do terceiro produto: ");
        prod3_0104 = Float.valueOf(input.nextLine());
        System.out.println();
        System.out.println("Digite o Preço dos dias 01/05");
        System.out.print("Preço do primeiro produto: ");
        prod1_0105 = Float.valueOf(input.nextLine());
        System.out.print("Preço do segundo produto: ");
        prod2_0105 = Float.valueOf(input.nextLine());
        System.out.print("Preço do terceiro produto: ");
        prod3_0105 = Float.valueOf(input.nextLine());

        //Processamento
        taxa1 = ((prod1_0105 - prod1_0104)/prod1_0104)*100;
        taxa2 = ((prod2_0105 - prod2_0104)/prod2_0104)*100;
        taxa3 = ((prod3_0105 - prod3_0104)/prod3_0104)*100;

        //Saída de dados
        System.out.println("Taxa de inflação (em porcentagem) do primeiro produto: "+taxa1);
        System.out.println("Taxa de inflação (em porcentagem) do segundo produto: "+taxa2);
        System.out.println("Taxa de inflação (em porcentagem) do terceiro produto: "+taxa3);

    }
}