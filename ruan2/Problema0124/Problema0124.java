import java.util.Scanner;

public class Problema0124{

    /*Depois da liberação do governo para as mensalidades dos planos de saúde, as pessoas começaram a fazer 
    pesquisas para descobrir um bom plano, não muito caro. Um vendedor de um plano de saúde apresentou a 
    tabela a seguir. Crie um algoritmo que entre com o nome e a idade de uma pessoa e imprima o nome e o
    valor que ela deverá pagar.
    * ate l0 anos -R$ 30 00
    * acima de 10 até 29 anos - R$ 60,00
    * acima de 29 até 45 anos - R$ 120,00
    * acima de 45 até 59 anos - R$ 150,00
    * acima de 59 até 65 anos - R$ 250,00
    * maior que 65 anos - R$ 400,00 */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int idade;

        System.out.print("Digite seu nome: ");
        nome = input.nextLine();
        System.out.print("Digite sua idade: ");
        idade = Integer.valueOf(input.nextLine());

        if(idade <= 10){
            System.out.println("Valor da conta do "+nome+" - R$ 30");
        }
        else{
            if(idade <= 29){
                System.out.println("Valor da conta do "+nome+" - R$ 60");
            }
            else{
                if(idade <= 45){
                    System.out.println("Valor da conta do "+nome+" - R$ 120");
                }
                else{
                    if(idade <= 59){
                        System.out.println("Valor da conta do "+nome+" - R$ 150");
                    }
                    else{
                        if(idade <= 65){
                            System.out.println("Valor da conta do "+nome+" - R$ 250");
                        }
                        else{
                            System.out.println("Valor da conta do "+nome+" - R$ 400");
                        }
                    }
                }
            }
        }
    }
}