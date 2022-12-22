import java.util.Scanner;

public class Problema0393{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int soma1, soma2, soma3, crit1 = 0, crit2 = 0, crit3 = 0, v1 = -1, v2 = -1, v3 = -1;
        String[] alunos = new String[5];
        int[][] notas = new int[5][4];

        for(int i = 0; i < 5; i++){
            System.out.println("\nDigite o nome do "+i+"º aluno: ");
            alunos[i] = input.nextLine();
            soma1 = 0;
            soma2 = 0;
            soma3 = 0;
            int maior1 = 0, maior2 = 0, k = 0, maior3 = 0, maior4 = 0;
            for(int j = 0; j < 4; j++){
                if(j == 0)
                    System.out.println("Digite a nota 1 do Primeiro Professor: ");
                else if(j == 1)
                    System.out.println("Digite a nota 1 do Segundo Professor: ");
                else if(j == 2)
                    System.out.println("Digite a nota 2 do Primeiro Professor: ");
                else
                    System.out.println("Digite a nota 2 do Segundo Professor: ");
                notas[i][j] = Integer.valueOf(input.nextLine());
                //a)
                soma1 += notas[i][j];
                
                //b)
                if(notas[i][j] > maior1){
                    maior1 = notas[i][j];
                    k = j;
                }

                //c)
                if(notas[i][j] > maior3 && j < 2)
                    maior3 = notas[i][j];
                else if(notas[i][j] > maior4 && j > 1)
                    maior4 = notas[i][j];
                soma3 = maior3 + maior4;

            }
            //a)
            if(crit1 < (soma1 / 4)){
                crit1 = soma1 / 4;
                v1 = i;
            }
            //b)
            for(int j = 0; j < 4; j++){
                if(notas[i][j] > maior2 && j != k)
                    maior2 = notas[i][j];
                soma2 = maior1 + maior2;
            }
            if(crit2 < (soma2 / 2)){
                crit2 = soma2 / 2;
                v2 = i;
            }
            //c)
            if(crit3 < (soma3 / 2)){
                crit3 = soma3 / 2;
                v3 = i;
            }
        }

        System.out.println("Vencedor Critério 1: " + alunos[v1]);
        System.out.println("Vencedor Critério 2: " + alunos[v2]);
        System.out.println("Vencedor Critério 3: " + alunos[v3]);
        
        if(v1 != v2 && v1 != v3){
            if(v1 > v2 && v1 > v3)
                System.out.println("Vencedor Geral:  "+ alunos[v1]);
            else if(v2 > v1 && v2 > v3)
                System.out.println("Vencedor Geral:  "+ alunos[v2]);
            else if(v3 > v1 && v3 > v2)
                System.out.println("Vencedor Geral:  "+ alunos[v2]);
        }
        else if(v1 == v2)
            System.out.println("Vencedor Geral: " + alunos[v1]);
        else if(v2 == v3)
            System.out.println("Vencedor Geral: " + alunos[v2]);
        else if(v3 == v1)
            System.out.println("Vencedor Geral: " + alunos[v3]);
        
        
        //a) A pontuação final é dada pela média das quatro notas;
        //b) A pontuação final é dada pela média das duas maiores notas recebidas pelo aluno (não importa se as notas foram obtidas na mesma prova ou não).
        //c) A pontuação final é dada pela média da maior nota obtida pelo aluno em cada uma das duas provas. 
        //Por fim, o programa deve imprimir o nome do candidato aprovado em cada um dos critérios e indicar quem deve ser selecionado.
    }
}