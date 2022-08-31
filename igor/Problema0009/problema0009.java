import java.util.Scanner;

public class problema0009 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        

        System.out.println("Escreve o primeiro numero: ");
        float x = input.nextFloat();
        System.out.println("Escreve o segundo numero: ");
        float y = input.nextFloat();
       
       double resultado = Math.pow(x, y);
            
        System.out.println("O resultado é: "+resultado);
        

    }
}