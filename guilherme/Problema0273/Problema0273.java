import java.util.Scanner;

public class Problema0273{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int j;
        int[] logica = new int[15];
        int[] linguagemProgramacao = new int[10];
        for(int i = 0; i < 15; i++){
            System.out.print("Digite uma matricula da turma de Lógica: ");
            logica[i] = Integer.valueOf(input.nextLine());
        }
        for(int i = 0; i < 10; i++){
            System.out.print("Digite uma matricula da turma de Linguagem de Programação: ");
            linguagemProgramacao[i] = Integer.valueOf(input.nextLine());
        }
        for(int i = 0; i < 15; i++){
            j = 0;
            while(j != 10)
            if(logica[i] == linguagemProgramacao[j]){
                System.out.println("Número de matrícula matrículado nos dois cursos: " + logica[i]);
                j++;
            }
            else{
                j++;
            }
        }
    }
}