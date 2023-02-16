import java.util.Arrays;
import java.util.Scanner;

public class problema0400{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c[][] = new int[4][4];
        int v1, v2, v3, cont = 0;

        for(int i = 0; i<4; i++){
            for(int j=0; j<4; j++){
                System.out.print("Digite para linha["+i+"], coluna["+j+"]: ");
                c[i][j] = Integer.parseInt(input.nextLine());
            }
        }

        System.out.print("Digite o valor 1: ");
        v1 = Integer.parseInt(input.nextLine());
        System.out.print("Digite o valor 2: ");
        v2 = Integer.parseInt(input.nextLine());
        System.out.print("Digite o valor 3: ");
        v3 = Integer.parseInt(input.nextLine());

        for(int i = 0; i<4; i++){
            for(int j = 0; j<4; j++){
                if(c[i][j] == v1){
                    cont++;
                } else {
                    if (c[i][j] == v2){
                        cont++;
                    } else {
                        if (c[i][j] == v3){
                            cont++;
                        }
                    }
                }
            }
        }

        System.out.println("Quantidade de valores digitados contidos na matriz: "+cont);
    }

}