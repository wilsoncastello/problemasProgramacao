import java.util.Scanner;
public class Problema0255{
    public static void main(String[] args) {
        //Faça um programa que preencha um vetor com dez números inteiros,
        // calcule e mostre o vetor resultante de uma ordenação decrescente.
        Scanner input=new Scanner(System.in);
        double vetor[]=new double[10];
        double numero=0;
       for(int i=0;i<10;i++){
        System.out.println("Digite um numero inteiro de posicao "+i+": " );
        vetor[i]=Double.valueOf(input.nextLine());
        for (int j = 0; j < i; j++) {
                if (vetor[i] > vetor[j]) {
                    numero = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = numero;
                }
            }
 
    } 
       for(int j=0;j<10;j++){
       System.out.println("Vetor em ordem decrescente: "+vetor[j]);
       }

    }

}