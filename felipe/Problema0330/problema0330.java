import java.util.Scanner;

public class problema0330{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = input.nextLine();

        String[] words = frase.split("\\s+");

        System.out.println("Número de palavras nessa frase: "+words.length);
    }

}