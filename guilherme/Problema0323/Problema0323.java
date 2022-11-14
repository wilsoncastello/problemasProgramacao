import java.util.Scanner;

public class Problema0323{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String mensagem;
        System.out.println("Escreva uma mensagem: ");
        mensagem = input.nextLine();

        System.out.println("\nMensagem original: "+mensagem);

        mensagem = mensagem.replaceAll("a","x");
        mensagem = mensagem.replaceAll("A","X");
        
        mensagem = mensagem.replaceAll("e","y");
        mensagem = mensagem.replaceAll("E","Y");
        
        mensagem = mensagem.replaceAll("i","w");
        mensagem = mensagem.replaceAll("I","W");
        
        mensagem = mensagem.replaceAll("o","k");
        mensagem = mensagem.replaceAll("O","K");
        
        mensagem = mensagem.replaceAll("u","z");
        mensagem = mensagem.replaceAll("U","Z");
        
        System.out.println("\nMensagem criptografada: "+mensagem);
        
    }
}