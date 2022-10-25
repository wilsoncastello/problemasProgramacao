
import java.util.Scanner;

public class problema0003{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        float nota1 = Float.valueOf(input.nextLine());
        System.out.println("Agora, digite o peso da primeira nota: ");
        float peso1 = Float.valueOf(input.nextLine());
        System.out.println("Digite a segunda nota: ");
        float nota2 = Float.valueOf(input.nextLine());
        System.out.println("Agora, digite o peso da segunda nota: ");
        float peso2 = Float.valueOf(input.nextLine());
        System.out.println("Digite a terceira nota: ");
        float nota3 = Float.valueOf(input.nextLine());
        System.out.println("Agora, digite o peso da terceira nota: ");
        float peso3 = Float.valueOf(input.nextLine());

        float notaFinal = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

        System.out.println("O resultado da média ponderada é de: " + notaFinal);

        input.close();

    }

}
