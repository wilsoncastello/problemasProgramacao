import java.util.Scanner;

public class problema0129{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        int escolha;

        System.out.print("Digite o nome do livro: ");
        nome = input.nextLine();

        System.out.print("Tipo de usuário: \n\t1 - Professor\n\t2 - Aluno\nDigite: ");
        escolha = Integer.parseInt(input.nextLine());

        switch(escolha){
            case 1:
                System.out.println("Recibo :\n\t" + nome + "\n\tTipo de usuário: Professor \n\tPrazo: 10 dias.");
                break;
            case 2:
                System.out.println("Recibo :\n\t" + nome + "\n\tTipo de usuário: Aluno \n\tPrazo: 3 dias.");
                break;
            default:
                System.out.println("Opção inválida.");
        }

    }

}