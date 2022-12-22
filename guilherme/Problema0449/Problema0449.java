import java.util.Scanner;

public class Problema0449{
    static Scanner input = new Scanner(System.in);

    public static void mostraVetor(int[] v){
        System.out.println("Números no vetor: ");
        for(int i = 0; i < 12; i++){
            System.out.println(v[i]);
        }
    }

    public static void copiaMatriz(int[][] m, int[] v){
        int k = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                v[k] = m[i][j];
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] matriz = new int[3][4];
        int[] vetor = new int[12];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                System.out.println("Digite o nº da linha "+i+" e coluna "+j+": ");
                matriz[i][j] = Integer.valueOf(input.nextLine());
            }
        }
        copiaMatriz(matriz, vetor);
        mostraVetor(vetor);
    }
}