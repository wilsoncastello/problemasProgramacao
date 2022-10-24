import java.util.Scanner;

public class Problema0310 {
    public static void main(String[] args) {
        /*Faça um programa que leia um vetor A com dez elementos numéricos inteiros e apresente 
        o total de elementos ímpares existentes no vetor e também o percentual de números ímpares em relação 
        à quantidade total de elementos armazenados no vetor. */
        Scanner input=new Scanner(System.in);
        int vetorA[]=new int[10];
        int impar=0;
        double porcentagem;
        for(int i=0;i<10;i++){
            System.out.println("Digite um numero no vetor A de posicao "+i+": ");
            vetorA[i]=Integer.valueOf(input.nextLine());
            if(vetorA[i]%2==1){
                impar++;
            }

        }
        porcentagem=impar*0.1;
        System.out.println("Quantidade de numeros impares: "+impar);
        System.out.println("Porcentagem de numeros impares: "+porcentagem);
    }


}
