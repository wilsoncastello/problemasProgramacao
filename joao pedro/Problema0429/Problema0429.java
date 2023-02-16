import java.util.Scanner;




public class Problema0429 {
    
    public static void funcao(int []x,String []y,int n,Scanner input){
        for(int i=0;i<n;i++){
            System.out.println("Digite um valor para o vetor de numeros (posicao "+i+"): ");
            x[i]=Integer.valueOf(input.nextLine());

        }
        for(int i=0;i<n;i++){
            System.out.println("Digite um valor para o vetor de caracteres (posicao "+i+"): ");
            y[i]=input.nextLine();

        }
        
        for(int i=0;i<n;i++){
            System.out.println(y[i].repeat(x[i]));
        }


    }





    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Digite o tamanho dos vetores: ");
        int n=Integer.valueOf(input.nextLine());
        int []x=new int[n];
        String []y=new String[n];
        funcao(x,y,n,input);
        
    }
}
