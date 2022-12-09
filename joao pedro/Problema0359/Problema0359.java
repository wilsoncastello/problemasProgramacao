
import java.util.Scanner;
public class Problema0359 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String []nomes=new String [1000];
        String sala120="  ",sala121="  ",sala122="  ";
        
        System.out.println("Lista de alunos (Digite '#' para concluir a lista): ");
        
        for(int i=0;i<1000;i++){
            
            System.out.println("Nome do aluno "+i+": ");
            nomes[i]=input.nextLine();
            if(nomes[i].equals("#")){
                break;
            }
            if(nomes[i].charAt(0)>='A' && nomes[i].charAt(0)<='K'){
                sala120=nomes[i]+"  "+sala120;
            }
            if(nomes[i].charAt(0)>='L' && nomes[i].charAt(0)<='N'){
                sala121=nomes[i]+"  "+sala121;
            }
            if(nomes[i].charAt(0)>='O' && nomes[i].charAt(0)<='Z'){
                sala122=nomes[i]+"  "+sala122;
            }
           
        }
        System.out.println("Alunos da sala 120: "+sala120);
        System.out.println("Alunos da sala 121: "+sala121);
        System.out.println("Alunos da sala 122: "+sala122);
      
}}
