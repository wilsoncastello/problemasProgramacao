package problemasProgramacao.cristopher.Problema0173;

import java.util.Scanner;

public class problema0173{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int numeroCanal = 1;
        int qtdPessoasAssistindo4 = 0, qtdPessoasAssistindo5 = 0, qtdPessoasAssistindo7 = 0, qtdPessoasAssistindo12 = 0;
        int somaCanal4 = 0, somaCanal5 = 0, somaCanal7 = 0, somaCanal12 = 0;

        while(numeroCanal != 0){
            System.out.println("Digite o número do canal: ");
            numeroCanal = Integer.valueOf(input.nextLine());
            if(numeroCanal == 4){
                System.out.println("Informe a quantidade de pessoas assistindo a esse canal: ");
                qtdPessoasAssistindo4 = Integer.valueOf(input.nextLine());
                somaCanal4 = somaCanal4 + qtdPessoasAssistindo4;
            }else if(numeroCanal == 5){
                System.out.println("Informe a quantidade de pessoas assistindo a esse canal: ");
                qtdPessoasAssistindo5 = Integer.valueOf(input.nextLine());
                somaCanal5 = somaCanal5 + qtdPessoasAssistindo5;
            }else if(numeroCanal == 7){
                System.out.println("Informe a quantidade de pessoas assistindo a esse canal: ");
                qtdPessoasAssistindo7 = Integer.valueOf(input.nextLine());
                somaCanal7 = somaCanal7 + qtdPessoasAssistindo7;
            }else if(numeroCanal == 12){
                System.out.println("Informe a quantidade de pessoas assistindo a esse canal: ");
                qtdPessoasAssistindo12 = Integer.valueOf(input.nextLine());
                somaCanal12 = somaCanal12 + qtdPessoasAssistindo12;
            }else{
                System.out.println("Número do canal inválido.");
            }

        }

        float quantidadeTotalEspectadores = somaCanal4 + somaCanal5 + somaCanal7 + somaCanal12;
        float percentualCanal4 = (somaCanal4 * 100) / quantidadeTotalEspectadores;
        float percentualCanal5 = (somaCanal5 * 100) / quantidadeTotalEspectadores;
        float percentualCanal7 = (somaCanal7 * 100) / quantidadeTotalEspectadores;
        float percentualCanal12 = (somaCanal12 * 100) / quantidadeTotalEspectadores;

        System.out.println("Total de pessoas assistindo ao canal 4: " + somaCanal4);
        System.out.println("Percentual de audiência do canal 4: " + percentualCanal4  + "(%)");
        System.out.println();
        System.out.println("Total de pessoas assistindo ao canal 5: " + somaCanal5);
        System.out.println("Percentual de audiência do canal 5: " + percentualCanal5  + "(%)");
        System.out.println();
        System.out.println("Total de pessoas assistindo ao canal 7: " + somaCanal7);
        System.out.println("Percentual de audiência do canal 7: " + percentualCanal7  + "(%)");
        System.out.println();
        System.out.println("Total de pessoas assistindo ao canal 12: " + somaCanal12);
        System.out.println("Percentual de audiência do canal 12: " + percentualCanal12  + "(%)");

        





        input.close();
        
    }

}