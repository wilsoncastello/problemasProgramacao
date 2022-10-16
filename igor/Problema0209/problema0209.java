import java.util.Scanner;


public class problema0209 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String nTurma;
        int nAluno, nAula, reprovado =0, nFaltas;
       
        System.out.println("Numero da turma: ");
        nTurma= input.nextLine();
        while(!(nTurma.equals("*"))) {
        
        System.out.println("Numero de aula dadas: ");
        nAula = Integer.parseInt(input.nextLine());
        System.out.println("Numero de alunos: ");
        nAluno = Integer.parseInt(input.nextLine());

        for(int i =0; i<nAluno;i++){
            System.out.println("Numero da faltas: ");
            nFaltas = Integer.parseInt(input.nextLine());

            float percentualFalta =(nFaltas*100)/nAula;

            if( percentualFalta > 25){
                reprovado = reprovado+1;
            }
        }

        System.out.println(nTurma+": Numero reprovados: "+reprovado);
        System.out.println("Numero da turma: ");
        nTurma= input.nextLine();
       } 
 }
}