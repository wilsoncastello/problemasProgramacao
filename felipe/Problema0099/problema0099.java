import java.util.Scanner;

public class problema0099{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double sb, sf;
        int idade, tempoServico, dependentes;

        System.out.print("Digite o salário base: ");
        sb = Double.parseDouble(input.nextLine());

        System.out.print("Digite a idade: ");
        idade = Integer.parseInt(input.nextLine());

        System.out.print("Digite os anos de seviço: ");
        tempoServico = Integer.parseInt(input.nextLine());

        System.out.print("Digite a quantidade de dependentes: ");
        dependentes = Integer.parseInt(input.nextLine());

        if( idade > 50 ){
            sf = sb + ((idade - 50) * (sb / 100 * 1));
            sf = sf + tempoServico * (sb / 100 * 2);
        } else {
            sf = sb + tempoServico * (sb / 100 * 2);
        }

        System.out.println("Salário final: "+sf);

        if( dependentes <= 5 && dependentes != 0){
            sf = (sb / 100 * 4);
            System.out.println(sf + " para cada dependente.");
        } else {
            System.out.println("Não aplicável.");
        }

    }

}