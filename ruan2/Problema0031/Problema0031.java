import java.util.Scanner;

public class Problema0031{

/*Faça um programa que receba o raio, calcule e mostre: 
a) o comprimento de uma esfera; sabe-se que C = 2 * π R; 
b) a área de uma esfera; sabe-se que A = 4 π R²; 
c) o volume de uma esfera; sabe-se que V = 4/3 * π * R³*/

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        float raio;
        float compEsf, areaEsf, volEsf;

        //Entrada de dados
        System.out.print("Digite o valor do raio da esfera: ");
        raio = Float.valueOf(input.nextLine());

        //Processamento
        compEsf = (float) (2 * 3.14 * raio);
        areaEsf = (float)(4 * 3.14 * (raio * raio));
        volEsf = (float)((4 * 3.14 * (raio * raio * raio))/3);

        //Saída de dados
        System.out.println();
        System.out.println("O Comprimento da esfera: "+compEsf);
        System.out.println("A Área da esfera: "+areaEsf);
        System.out.println("O Volume da esfera: "+volEsf);
    }
}
