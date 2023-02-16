import java.util.Scanner;

public class problema0384 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String[][] matriz = new String[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(i == j){
                    matriz[i][j] =  "@";
                }
                else
                    System.out.println("Digite um número para a linha "+i+" e coluna "+j+" :");
                    matriz[i][j] = input.nextLine(); 
            }
        }
        System.out.println("A matriz resultante é: ");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j]+" ");  
            }
            System.out.println("");
        }
    }
}