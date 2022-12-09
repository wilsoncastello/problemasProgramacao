import java.util.Scanner;

public class Problema0387 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int [][]matriz=new int[3][3];
        System.out.println("Digite valores inteiros: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                matriz[i][j]=Integer.valueOf(input.nextLine());
            }
        
        }
        int x = matriz.length;
        int y = matriz[0].length;
        int[][] rotacionado = new int[y][x];
        for (int i=0; i<y; i++) {
        for (int j=0; j<x; j++) {
            rotacionado[i][j] = matriz[x - j - 1][i];
    }}
    for(int i=0;i<3;i++){
        System.out.println("");
        for(int j=0;j<3;j++){
            System.out.print(rotacionado[i][j]);
        }
    }
}}
    