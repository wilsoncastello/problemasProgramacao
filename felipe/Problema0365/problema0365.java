import java.util.Arrays;
import java.util.Scanner;

public class problema0365{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c[][] = new int[4][3];
        int menor, maior = 0, indice =0;

        for(int i = 0; i<4; i++){
            for(int j=0; j<3; j++){
                System.out.println("Digite para linha["+i+"], coluna["+j+"]: ");
                c[i][j] = Integer.parseInt(input.nextLine());
            }
        }
        
        menor = c[0][0];

        System.out.println(Arrays.deepToString(c));

        for(int i = 0; i<4; i++){
            for(int j = 0; j<3; j++){
                if(c[i][j] < menor){
                    menor = c[i][j];
                    indice = i;
                }
            }
        }

        for(int i = indice; i<indice+1; i++){
            for(int j = 0; j < 3; j++){
                if(c[i][j] > maior){
                    maior = c[i][j];
                }
            }
        }

        System.out.println("O maior elemento da linha onde se encontra o menor elemento: "+ maior);

    }

}