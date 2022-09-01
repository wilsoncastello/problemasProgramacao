package problemasProgramacao.cristopher.Problema0051;

import java.util.Scanner;

public class problema0051{

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o tempo gasto na viagem (em horas): ");
        float tempoGastoHoras = Float.valueOf(input.nextLine());
        
        System.out.println("Informe a velocidade média na viagem (em km):");
        float velocidadeMedia = Float.valueOf(input.nextLine());
        
        float distanciaPercorrida = velocidadeMedia * tempoGastoHoras;
        
        float qtdLitros = distanciaPercorrida / 12.0f;
        
        System.out.println("A distâcia percorrida no total foi de " + distanciaPercorrida + " Km.");
        System.out.println("A quantidade de litros gasta na viagem foi de " + qtdLitros + " L.");

        input.close();

    }

}