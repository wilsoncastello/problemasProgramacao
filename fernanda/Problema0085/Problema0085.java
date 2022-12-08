import java.util.Scanner;
public class Problema0085 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double portugues, matematica, conhecimentosGerais, media;
        String nome;
        
        System.out.print("Digite o seu nome: ");
        nome = input.nextLine();
        
        System.out.print("Digite a nota de Potuguês: ");
        portugues = Double.valueOf(input.nextLine());
        System.out.print("Digite a nota de Matemática: ");
        matematica = Double.valueOf(input.nextLine());
        System.out.print("Digite a nota de Conhecimentos Gerais: ");
        conhecimentosGerais = Double.valueOf(input.nextLine());
        
        System.out.println(" ");
        System.out.println("Nome do Candidato: "+nome);
        System.out.println("Nota em Potuguês: "+portugues);
        System.out.println("Nota em Matemática: "+matematica);
        System.out.println("Nota em Conhecimentos Gerais: "+conhecimentosGerais);
        media = (portugues + matematica + conhecimentosGerais)/3;
        System.out.println("Média: "+media);
        if(media >= 7){
            System.out.println("Candidato Aprovado");
                
        }else
            System.out.println("Candidato Não Aprovado");
    }
}