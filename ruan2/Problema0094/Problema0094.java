import java.util.Scanner;

    /*Um hotel cobra R$130,00 a diária e mais uma taxa de serviços. 
    A taxa de serviços é de: 
    R$8,50 por diária, se o número de diárias for maior que 15; 
    R$10,00 por diária, se o número de diárias for igual a 15; 
    R$12,00 por diária, se o número de diárias for menor que 15. 
    Construa um algoritmo que mostre o nome e a conta de um cliente. */

public class Problema0094{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String nome;
        int numDias;
        double diariaTotal;

        //Entrada de dados
        System.out.println("Olá, digite suas informações!");
        System.out.print("Seu nome: ");
        nome = input.nextLine();
        System.out.print("Quantidade de dias hospedado: ");
        numDias = Integer.valueOf(input.nextLine());

        //Processamento
        if(numDias > 15){
            diariaTotal = (numDias * 130) + (numDias * 8.5);
        }
        else{
            if(numDias == 15){
                diariaTotal = (numDias * 130) + (numDias * 10);
            }
            else{
                diariaTotal = (numDias * 130) + (numDias * 12);
            }
        }

        //Saída de dados
        System.out.println("Informações do hospede");
        System.out.println("Nome: "+nome);
        System.out.println("Conta: "+diariaTotal);
    }
}