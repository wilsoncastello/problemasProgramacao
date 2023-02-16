import java.util.Scanner;

public class problema0377 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[][] matriz = new int[3][3];
        int somaElementosDiagonalPrincipal = 0;
        float mediaElementosDiagonalPrincipal;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.println("Digite um número para a linha "+i+" e coluna "+j+" :");
                matriz[i][j] = Integer.valueOf(input.nextLine()); 
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(i == j){
                    somaElementosDiagonalPrincipal = somaElementosDiagonalPrincipal + matriz[i][j];
                }
            }
        }
        mediaElementosDiagonalPrincipal = somaElementosDiagonalPrincipal / 3;
        System.out.println("A média dos elementos da diagonal principal é: "+mediaElementosDiagonalPrincipal);
    }
}