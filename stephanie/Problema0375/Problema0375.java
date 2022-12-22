package stephanie.Problema0375;

public class Problema0375 {

public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] A = new int[3][4];
        int [][] B = new int[3][4];
        int [][] C = new int[3][4];
        int [][] D = new int[3][4];
        int i, j;

        System.out.println("Digite os dados da matriz A: ");
        for (i=0;i<3;i++){
            for (j=0;j<4;j++){
                System.out.print("Digite o elemento da linha "+i+" coluna "+j+": ");
        A[i][j] = Integer.valueOf(input.nextLine());
            }
        }
        System.out.println("Digite os dados da matriz B: ");
        for (i=0;i<3;i++){
            for (j=0;j<4;j++){
                System.out.print("Digite o elemento da linha "+i+" coluna "+j+": ");
                B[i][j] = Integer.valueOf(input.nextLine());
            }
        }

        for (i=0;i<3;i++){
            for (j=0;j<4;j++){
                C[i][j] = A[i][j] + B[i][j];
            }
        }
        for (i=0;i<3;i++){
            for (j=0;j<4;j++){
                C[i][j] = A[i][j] - B[i][j];
            }
        }
        
        System.out.println("Matriz da soma das duas matrizes ");
        for (i=0;i<3;i++){
            for (j=0;j<4;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("Matriz da diferença das duas matrizes ");
        for (i=0;i<5;i++){
            for (j=0;j<3;j++){
                System.out.print(D[i][j]+" ");
            }
            System.out.println("");
        }
    }


}