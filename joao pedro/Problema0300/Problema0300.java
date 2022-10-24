import java.util.Scanner;
public class Problema0300{
    public static void main(String[] args) {
        /*Faça um programa que leia um conjunto de números ordenados e armazene-o em um vetor X.
        Faça um algoritmo que verifique se um dado valor Y existe em X. Caso não exista, inclua Y em X 
        de forma que X continue ordenado. Obs.: Não deve ser usado nenhum processo de ordenação. */
        Scanner input=new Scanner(System.in);
        int n=0,check=0;
        
        double y;

        System.out.println("Digite a quantidade de numeros no vetor X:");
        n=Integer.valueOf(input.nextLine());
        double vetorX[]=new double[n];
        for(int i=0;i<n;i++){
            System.out.println("Digite um numero na posicao "+i+" do vetor X: ");
            vetorX[i]=Double.valueOf(input.nextLine());

        }
        System.out.println("Digite um valor Y: ");
        y=Double.valueOf(input.nextLine());

        for(int i=0;i<n;i++){
            if(y==vetorX[i]){
                System.out.println("O valor Y existe no vetor X");
                check=1;

            }
            
        }
        if(check==0){
            System.out.println("O valor Y nao esta no vetor X. Incluindo valor Y");
            vetorX[0]=y;
        }
        for(int i=0;i<n;i++){
            System.out.println("Vetor X na posicao "+i+": "+vetorX[i]);
        }
    }


}