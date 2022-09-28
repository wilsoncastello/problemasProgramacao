import java.util.Scanner;

public class problema0113{

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    float numero;
    System.out.print("Digite um número:");
    numero = Float.valueOf(input.nextLine());
    if(numero % 3 == 0){
        System.out.println("O número "+numero+" é multiplo de 3.");
    }
    else
        System.out.println("O número "+numero+" não é multiplo de 3."); 
    }
}