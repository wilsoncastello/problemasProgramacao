import java.util.Scanner;

public class problema0052{

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        float n1, n2, elementoTroca;
        System.out.print("Digite o primeiro número:");
        n1 = Float.valueOf(input.nextLine());
        System.out.print("Digite o segundo número:");
        n2 = Float.valueOf(input.nextLine());
        elementoTroca = n2;
        n2 = n1;
        n1 = n3;
        System.out.println("O novo valor do primeiro número é: "+n1);
        System.out.println("O novo valor do segundo número é: "+n2);
    }
}