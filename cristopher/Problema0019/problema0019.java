package problemasProgramacao.cristopher.Problema0019;

import java.util.Scanner;

public class problema0019 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o angulo (em graus): ");
        int angulo = Integer.valueOf(input.nextLine());
        
        System.out.println("Informe a altura da parede: ");
        float altura = Float.valueOf(input.nextLine());
        
        float radianos, escada;
        
        radianos = (angulo * 3.14f) / 180;
        
        escada = (float) (altura / Math.sin(radianos));
        
        System.out.println("Medida da escada: " + escada);

        input.close();
    }



}
