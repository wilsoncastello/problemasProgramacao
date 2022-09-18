package problemasProgramacao.cristopher.Problema0097;

import java.util.Scanner;

public class problema0097 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro valor: ");
        float a = Float.valueOf(input.nextLine());
        System.out.println("Informe o segundo valor: ");
        float b = Float.valueOf(input.nextLine());
        System.out.println("Informe o terceiro valor: ");
        float c = Float.valueOf(input.nextLine());

        boolean ehTriangulo = false;

        //Condições para ser um triângulo
        if(a > 0 && b > 0 && c > 0){
            if(a < (b + c) && b < (a + c) && c < (a + b)){
                ehTriangulo = true;
            }else{
                System.out.println("Não é um triângulo.");
            }
        }else{
            System.out.println("Não é um triângulo.");
        }

        if(ehTriangulo == true && a == b && a == c){
            System.out.println("É um triângulo equilátero.");

        }else if(ehTriangulo == true && a == b || b == c || a == c){
            System.out.println("É um triângulo isósceles.");

        }else if(ehTriangulo == true && a != b && b != c && a != c){
            System.out.println("É um triângulo escaleno.");
        }

        input.close();
    }
}
