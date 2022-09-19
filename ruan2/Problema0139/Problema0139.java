import java.util.Scanner;

/*Faça um programa que leia os valores de quatro notas escolares 
bimestrais de um aluno representadas pelas variáveis N1, N2, N3 e N4, 
calcule a média aritmética (variável MD1) desse aluno e apresente a 
mensagem "Aprovado" se a média obtida for maior ou igual a 7; 
caso contrário, o programa deve solicitar a quinta nota (nota de exame, 
representada pela variável NE) do aluno e calcular uma nova média aritmética 
(variável MD2) entre a nota de exame e a primerira média aritmática. 
Se o valor da nova média for maior ou igual a cinco, apresentar a mensagem 
"Aprovado em exame"; caso contrário, apresentar a mensagem "Reprovado". O programa 
deve informar também, após a apresentação das mensagens, o valor da média obtida pelo aluno.*/

public class Problema0139{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float N1, N2, N3, N4, NE;
        float MD1, MD2;

        System.out.print("Digite a primeira nota do aluno(a): ");
        N1 = Float.valueOf(input.nextLine());
        System.out.print("Digite a segunda nota do aluno(a): ");
        N2 = Float.valueOf(input.nextLine());
        System.out.print("Digite a terceira nota do aluno(a): ");
        N3 = Float.valueOf(input.nextLine());
        System.out.print("Digite a quarta nota do aluno(a): ");
        N4 = Float.valueOf(input.nextLine());

        MD1 = (N1 + N2 + N3 + N4)/4;

        if(MD1 >= 7){
            System.out.println("Aprovado!");
            System.out.println("Media Final: "+MD1);
        }
        else{
            System.out.println("Não passou de primeira");
            System.out.print("Digite a nota do Exame do aluno(a): ");
            NE = Float.valueOf(input.nextLine());
            MD2 = (NE + MD1)/2;
            if(MD2 >= 5){
                System.out.println("Aprovado em exame!");
                System.out.println("Media Final: "+MD2);
            }
            else{
                System.out.println("Reprovado");
                System.out.println("Media Final: "+MD2);
            }
        }

    }
}