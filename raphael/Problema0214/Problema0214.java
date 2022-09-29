package raphael.Problema0214;

import java.util.Scanner;

public class Problema0214 {
    
    /* "Uma empresa decidiu fazer um levantamento em relação aos candidatos que se apresentarem para preenchimento de vagas no seu quadro de funcionários. Supondo que você seja o programador dessa empresa, crie um algoritmo que leia para cada candidato a idade, o sexo (M ou F) e a experiência no serviço (S ou N). 
    Para encerrar a entrada de dados, digite zero para a idade. Calcule e escreva: 
    - o número de candidatos do sexo feminino; 
    - o número de candidatos do sexo masculino; 
    - a idade média dos homens que já têm experiência no serviço; 
    - a porcentagem dos homens com mais de 45 anos entre o total dos homens; 
    - o número de mulheres com idade inferior a 35 anos e com experiência no serviço; 
    - a menor idade entre as mulheres que já têm experiência no serviço." */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int idade=1, contSexF=0, contSexM=0, cont1=0, mulherMenos35ComExp=0, menorIdadeFComExp = 100;

        float porc=0, somadorIdade=0, homemMais45=0;
        char sexo, exp;

        while (idade != 0) {

            System.out.println("Digite a idade do candidato (Digite \"0\" para encerrar o programa): ");
            idade = Integer.valueOf(input.nextLine());

            System.out.println("Digite o sexo do candidato (M ou F): ");
            sexo = input.nextLine().charAt(0);

            System.out.println("Digite se tem experiencia profissional (S ou N): ");
            exp = input.nextLine().charAt(0);

            if (sexo == 'F') {
                contSexF = contSexF + 1;

                if (idade < 35 && exp == 'S') {
                    mulherMenos35ComExp++;
                }

                if (idade < menorIdadeFComExp) {
                    menorIdadeFComExp = idade;
                }

            }
            else {
                if (sexo == 'M') {
                    contSexM++;

                    if (exp == 'S') {
                        cont1++;
                        somadorIdade = somadorIdade + idade;
                    }

                    if (idade > 45) {
                        homemMais45++;
                    }

                }
            }
            
            if (homemMais45 == 0) {
                porc =0;
            }
            else {
                porc = (homemMais45 * 100) / contSexM;
            }
            
        }
        
        System.out.println("\n São candidatos do sexo feminino: "+contSexF+"\n \n São candidatos do sexo masculino: "+contSexM+" \n \n A porcentagem de homens com mais de 45 anos é: "+porc+"% \n \n Mulheres com idade inferior a 35 anos e com experiência de serviço: "+mulherMenos35ComExp+" \n \n A mulher com menos idade, entre as que tem experiência tem: "+menorIdadeFComExp+" anos");
     
    }
    
}
