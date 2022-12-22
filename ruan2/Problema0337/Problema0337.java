import java.util.Scanner;

public class Problema0337{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String txt, txt2;

        System.out.print("Digite uma frase: ");
        txt = input.nextLine();

        if(txt.contains("aluno") || txt.contains("escola")){
            if(txt.contains("aluno") && txt.contains("escola")){
                txt2 = txt.replace("aluno", "estudante");
                System.out.println("Nova Frase: "+txt2.replace("escola", "universidade"));
            }
            else{
                if(txt.contains("aluno")){
                    txt2 = txt.replace("aluno", "estudante");
                    System.out.println("Nova Frase: "+txt2);
                }
                else{
                    txt2 = txt.replace("escola", "universidade");
                    System.out.println("Nova Frase: "+txt2);
                }
            }
        }
        else{
            System.out.println("Frase continua igual: "+txt);
        }
    }
}