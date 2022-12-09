import java.util.Scanner;

public class Problema0368{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[][] x = new int[4][4];
        int cont = 0;
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.println("Digite um número inteiro: ");
                x[i][j] = Integer.valueOf(input.nextLine());
                if(x[i][j] > 30)
                    cont++;
            }
        }
        System.out.println("Quantidade de elementos maior que 30: " + cont);

    }
}