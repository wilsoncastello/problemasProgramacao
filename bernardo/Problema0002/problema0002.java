import java.util.Scanner;

public class problema0002{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        float nota1;
        float nota2;
        float nota3;
        float media;
        
        //Entrada de valores
        System.out.println("Digite a primeira nota: ");
        nota1 = Float.valueOf(input.nextLine());
        System.out.println("Digite a segunda nota: ");
        nota2 = Float.valueOf(input.nextLine());
        System.out.println("Digite a terceira nota: ");
        nota3 = Float.valueOf(input.nextLine());
        
        //Cálculo da média
        media = (nota1 + nota2 + nota3) / 3;

        //Saída 
        System.out.println("Média aritmética das 3 notas: " + Math.round(media * 100d) / 100d);
    }
}
