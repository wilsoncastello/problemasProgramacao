import java.util.Scanner;
import java.lang.Math;

public class Problema0316{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int cont;
        double x;
        double[] a = new double[5];
        double[] b = new double[5];

        System.out.println("Digite 5 valores: ");
        for(int i = 0; i < 5; i++){
            a[i] = Float.valueOf(input.nextLine());
            b[i] = Math.pow(a[i],3);
        }

        System.out.println("Digite um número para buscar no vetor B: ");
        x = Double.valueOf(input.nextLine());
        while(x != 0){
            cont = 0;
            for(int i = 0; i < 5; i++){
                if(x == b[i])
                    System.out.println(x+" existe em B.");
                else
                    cont++;
            }
            if(cont == 5)
                System.out.println(x+" não existe em B.");

            System.out.println("\nDigite outro número ou 0 para encerrar: ");
            x = Double.valueOf(input.nextLine());
        }
        System.out.println("Até mais!");
    }
}