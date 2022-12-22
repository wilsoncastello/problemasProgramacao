import java.util.Scanner;

public class problema0397 {
    static Scanner input = new Scanner(System.in);

//Função para calcular determinante da matriz
    static double determinante(double matriz[][], int ordem) {
        double det = 0;
        if (ordem == 1) {
            return (matriz[0][0]);
        }
        if (ordem == 2) {
            return (matriz[0][0] * matriz[1][1] - matriz[1][0] * matriz[0][1]);
        } else {
            double[][] mat = new double[ordem - 1][ordem - 1];
            int col = 0;
            for (int intermediario = 0; intermediario < ordem; intermediario++) {
                for (int l = 1; l < ordem; l++) {
                    for (int coluna = 0; coluna < ordem; coluna++){
                        if (intermediario != coluna){
                            mat[l - 1][col++] = (int) matriz[l][coluna];
                        }
                    }
                    col = 0;
                }
                if (matriz[0][intermediario] != 0){
                    det += Math.pow((-1), intermediario) * matriz[0][intermediario]
                            * determinante(mat, ordem - 1);
                }
            }
        }
        return (det);
    }

    public static void main(String[] args) {

        double det;
        int ordem;
        String dependencia;
        double[][] matriz;

        // Entada de valores
        System.out.println("Digite a orderm da matriz: ");
        ordem = Integer.valueOf(input.nextLine());
        matriz = new double[ordem][ordem];
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.println("Digite o número " + (i+1) + "x" + (j+1) + ": ");
                matriz[i][j] = input.nextDouble();
            }
        }

        // Verificação de dependência linear e chamada de função
        det = determinante(matriz, ordem);
        if (det == 0) {
            dependencia = "linearmente dependente";
        } else {
            dependencia = "linearmente independente";
        }

        // Saída
        System.out.println("A matriz é: " + dependencia);

    }
}
