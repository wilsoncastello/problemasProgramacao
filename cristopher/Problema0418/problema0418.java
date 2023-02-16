package problemasProgramacao.cristopher.Problema0418;

import java.util.Scanner;

public class problema0418 {

    public static float conversor(float graus){
        float radianos;
        radianos = (graus * 3.14f) / 180;
        return radianos;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor (em graus): ");
        float graus = Float.valueOf(input.nextLine());

        float valorRadianos;
        valorRadianos = conversor(graus);
        
        System.out.println(valorRadianos);

        input.close();
        
    }
    
}
