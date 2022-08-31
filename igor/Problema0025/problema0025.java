import java.util.Scanner;

public class problema0025{

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("escreve o preco: ");
        float x = input.nextFloat();
        float z = (float) (10.0/100.0);
        float y = (x * (z));
        float res = x - y;

        System.out.println("O novo preco e: "+res);
    }


}