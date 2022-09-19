package problemasProgramacao.cristopher.Problema0127;

import java.util.Scanner;

public class problema0127 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o nome do primeiro finalista: ");
        String nome = input.nextLine();
        System.out.println("Pontuação: ");
        float pontuacao = Float.valueOf(input.nextLine());

        System.out.println("Informe o nome do segundo finalista: ");
        String nome2 = input.nextLine();
        System.out.println("Pontuação: ");
        float pontuacao2 = Float.valueOf(input.nextLine());

        System.out.println("Informe o nome do terceiro finalista: ");
        String nome3 = input.nextLine();
        System.out.println("Pontuação: ");
        float pontuacao3 = Float.valueOf(input.nextLine());

        if(pontuacao > pontuacao2 && pontuacao > pontuacao3){
            System.out.println("Vencedor: " + nome + ": " + pontuacao + " pontos.");
            if(pontuacao2 > pontuacao3){
                System.out.println("Segundo colocado: " + nome2 + ": " + pontuacao2 + " pontos.");
                System.out.println("Terceiro colocado: " + nome3 + ": " + pontuacao3 + " pontos.");
            }else{
                System.out.println("Segundo colocado: " + nome3 + ": " + pontuacao3 + " pontos.");
                System.out.println("Terceiro colocado: " + nome2 + ": " + pontuacao2 + " pontos.");
            }
        }else if(pontuacao2 > pontuacao && pontuacao2 > pontuacao3){
            System.out.println("Vencedor: " + nome2 + ": " + pontuacao2 + " pontos");
            if(pontuacao > pontuacao3){
                System.out.println("Segundo colocado: " + nome + ": " + pontuacao + " pontos.");
                System.out.println("Terceiro colocado: " + nome3 + ": " + pontuacao3 + " pontos.");
            }else{
                System.out.println("Segundo colocado: " + nome3 + ": " + pontuacao3 + " pontos.");
                System.out.println("Terceiro colocado: " + nome + ": " + pontuacao + " pontos.");
            }
        }else{
            System.out.println("Vencedor: " + nome3 + ": " + pontuacao3 + " pontos");
            if(pontuacao2 > pontuacao){
                System.out.println("Segundo colocado: " + nome2 + ": " + pontuacao2 + " pontos.");
                System.out.println("Terceiro colocado: " + nome + ": " + pontuacao + " pontos.");
            }else{
                System.out.println("Segundo colocado: " + nome + ": " + pontuacao + " pontos.");
                System.out.println("Terceiro colocado: " + nome2 + ": " + pontuacao2 + " pontos.");
            }

        }

        

        input.close();

    }
    
}
