package problemasProgramacao.cristopher.Problema0446;

import java.util.Scanner;

public class problema0446 {

    public static float mediaSalarial(float[] vetorSalario, int habitantes){
        float mediaSalarial = 0, soma = 0;
        for (int i = 0; i < habitantes; i++) {
            soma = soma + vetorSalario[i];
        }

        mediaSalarial = soma / habitantes;

        return mediaSalarial;
    }

    public static int retornaMaiorIdade(int[] vetorIdade, int habitantes){
        int maiorIdade = 0;
        for (int i = 0; i < habitantes; i++) {
            if(vetorIdade[i] > maiorIdade){
                maiorIdade = vetorIdade[i];
            }
        }

        return maiorIdade;
    }

    public static int retornaMenorIdade(int[] vetorIdade, int habitantes){
        int menorIdade = 999;
        for (int i = 0; i < habitantes; i++) {
            if(vetorIdade[i] < menorIdade){
                menorIdade = vetorIdade[i];
            }
        }

        return menorIdade;
    }

    public static int qtdHabitantesTresFilhos(int[] vetorFilhos, float[] vetorSalario, int habitantes){
        int total = 0;
        for (int i = 0; i < habitantes; i++) {
            if(vetorFilhos[i] == 3 && vetorSalario[i] <= 500){
                total++;
            }
        }
        
        return total;
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int habitantes = 10;
        int[] vetorIdade = new int[habitantes];
        float[] vetorSalario = new float[habitantes];
        int[] vetorFilhos = new int[habitantes];

        for (int i = 0; i < habitantes; i++) {
            System.out.println("Digite a idade da pessoa ["+i+"]: ");
            vetorIdade[i] = Integer.valueOf(input.nextLine());
            System.out.println("Digite o salário da pessoa ["+i+"]: ");
            vetorSalario[i] = Float.valueOf(input.nextLine());
            System.out.println("Digite o número de filhos da pessoa ["+i+"]: ");
            vetorFilhos[i] = Integer.valueOf(input.nextLine());
        }

        System.out.println("Média salarial: R$ " + mediaSalarial(vetorSalario, habitantes));
        System.out.println("Maior idade: " + retornaMaiorIdade(vetorIdade, habitantes));
        System.out.println("Menor idade: " + retornaMenorIdade(vetorIdade, habitantes));
        System.out.println("Qtd habitantes com três filhos e salário até R$500: " + qtdHabitantesTresFilhos(vetorFilhos, vetorSalario, habitantes));



        input.close();
        
    }
    
}
