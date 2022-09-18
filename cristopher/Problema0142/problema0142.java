package problemasProgramacao.cristopher.Problema0142;

import java.util.Scanner;

public class problema0142 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o tamanho da escada (em metros): ");
        float tamanhoEscada = Float.valueOf(input.nextLine());

        System.out.println("Informe a altura em que se deseja pregar o quadro: ");
        float alturaQuadro = Float.valueOf(input.nextLine());

        if(tamanhoEscada < alturaQuadro){
            System.out.println("A escada é muito pequena.");

        }

        float distanciaBase = (float) (Math.pow(tamanhoEscada, 2) - Math.pow(alturaQuadro, 2));
        distanciaBase = (float) Math.sqrt(distanciaBase);

        System.out.println("A distância em que a escada deverá ficar: " + distanciaBase);

        input.close();



    }
    
}
