import java.util.Scanner;

public class problema0362 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Entrada de valores
        double[] menor_notas = { 0.0, 0.0, 0.0 };
        double[] menor_provas = { 10.0, 10.0, 10.0 };
        int[] provas_quantidade = { 0, 0, 0 };
        double[][] notas = { { 0.0, 0.0, 0.0 }, { 0.0, 0.0, 0.0 }, { 0.0, 0.0, 0.0 } };
        int provas = 3;
        int alunos = 3;
        double verificacao = 10;

        for (int i = 0; i < alunos; i++) {
            verificacao = 10;
            for (int j = 0; j < provas; j++) {

                System.out.println("Digite a " + (j + 1) + " nota do " + (i + 1) + " aluno: ");
                notas[i][j] = Float.valueOf(input.nextLine());
                if (notas[i][j] <= verificacao) {
                    verificacao = notas[i][j];
                    menor_notas[i] = j + 1;
                }
                if (menor_provas[j] >= notas[i][j]) {
                    menor_provas[j] = notas[i][j];
                }
            }
        }

        // Cálculo da quantidade de menores notas
        for (int i = 0; i < provas; i++) {
            for (int j = 0; j < alunos; j++) {
                if (notas[j][i] == menor_provas[i]) {
                    provas_quantidade[i] += 1;
                }
            }
        }

        // Saída
        System.out.println("---Relatório---");
        for (int i = 0; i < alunos; i++) {
            System.out.println("A menor nota do " + (i + 1) + " aluno foi na prova " + menor_notas[i]);
        }
        for (int i = 0; i < provas; i++) {
            System.out.println("A quantdiade de alunos que tiraram a menor nota na prova " + (i + 1) + " foi "
                    + provas_quantidade[i]);
        }
    }
}