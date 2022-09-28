import java.util.Scanner;

public class Problema0185{

    //Digitar 10 números e imprimir a metade de cada número

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num, metadeN;

        for(int i=0; i<10; i++){
            System.out.print("Digite um numero: ");
            num = Float.valueOf(input.nextLine());
            metadeN = num/2;
            System.out.println("A metade do numero digitado: "+metadeN);
        }
    }
}