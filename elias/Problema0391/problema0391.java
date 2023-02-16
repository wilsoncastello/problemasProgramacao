import java.util.Scanner;

public class problema0391 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[][] matriz = new int[5][5];
        int coluna;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.println("Digite um número para a linha "+i+" e coluna "+j);
                matriz[i][j] = Integer.valueOf(input.nextLine()); 
            }
        }
        System.out.println("Digite o número correspondente a coluna solicitada a ser mostrada da matriz: (1 ao 5).");
        coluna = Integer.valueOf(input.nextLine());
        while(coluna != -1){
            System.out.println(" ");
            System.out.println("Coluna selecionada: ");
            if(coluna == 1){
                for (int i = 0; i < 5; i++) {
                System.out.println(matriz[i][0]);
                }
            }
            else if(coluna == 2){
                for (int i = 0; i < 5; i++) {
                System.out.println(matriz[i][1]);
                }
            }
            else if(coluna == 3){
                for (int i = 0; i < 5; i++) {
                System.out.println(matriz[i][2]);
                }
            }
            else if(coluna == 4){
                for (int i = 0; i < 5; i++) {
                System.out.println(matriz[i][3]);
                }        
            }
            else if(coluna == 5){
                for (int i = 0; i < 5; i++) {
                System.out.println(matriz[i][4]);
                }
            }
            else
                System.out.println("Número inválido, tente novamente !");
            System.out.println("Digite o número correspondente a coluna solicitada a ser mostrada da matriz: (1 ao 5). ");
            System.out.println("Digite -1 caso queira sair. ");
            coluna = Integer.valueOf(input.nextLine());
        }
    }
}