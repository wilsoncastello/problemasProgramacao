import java.util.Scanner;

public class Problema0038{
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int numero, sucessor, antecessor;

            System.out.print("Digite um número: ");
            numero = Integer.parseInt(input.nextLine());
       
            sucessor = numero+1;
            antecessor = numero-1;

            System.out.println("Sucessor: "+sucessor);
            System.out.println("Antecessor: "+antecessor);
    }
}    