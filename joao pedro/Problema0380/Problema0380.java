import java.util.Scanner;

public class Problema0380 {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int [][]matriz=new int[4][5];
        double [] vetor=new double[4];
        int []quantidadeArmazem=new int[5];
        int []quantidadeProd=new int[5];
       int maiorEstoque=0;
       int posicaoPreco=0;
       int []valorCada=new int[5];
        int menorEstoque=Integer.MAX_VALUE;
            for(int j=0;j<4;j++){
                System.out.println("Digite o preco do produto do produto"+j+": ");
                vetor[j]=Double.valueOf(input.nextLine());

            }
            for(int i=0;i<5;i++){
                for(int j=0;j<4;j++){
                    System.out.println("Digite a quantidade do produto "+i+" no armazem "+j+": ");
                    matriz[j][i]=Integer.valueOf(input.nextLine());
                    quantidadeArmazem[i]=matriz[j][i]+quantidadeArmazem[i];
                    quantidadeProd[j]=matriz[j][i]+quantidadeProd[j];
                    if(matriz[j][i]>maiorEstoque){
                        maiorEstoque=matriz[j][i];
                        posicaoPreco=j;
                    }
                    if(matriz[j][i]<menorEstoque){
                        menorEstoque=matriz[j][i];
                    }
                }
            }
        for(int i=0;i<5;i++){
            System.out.println("Quantidade no armazem "+i+": "+quantidadeArmazem[i]);

        }
        for(int i=0;i<4;i++){
            System.out.println("Quantidade do produto "+i+": " +quantidadeProd[i]);
        }
        System.out.println("Preco do produto de maior estoque: "+vetor[posicaoPreco]);
        System.out.println("Menor estoque armazenado: "+menorEstoque);
       
    }
}
