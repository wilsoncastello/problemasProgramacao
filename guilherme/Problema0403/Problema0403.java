import java.util.Scanner;

public class Problema0403{
    static Scanner input = new Scanner(System.in);

    public static float acrescimo(float x, float y){
        float z = y*100/x;
        return z;
    }

    public static void main(String[] args) {
        float valorAntigo, valorAtual;
        System.out.println("Digite o valor antigo de um produto: ");
        valorAntigo = Float.valueOf(input.nextLine());
        System.out.println("Digite o valor atual de um produto: ");
        valorAtual = Float.valueOf(input.nextLine());
        
        float acrescimo = acrescimo(valorAntigo, valorAtual);
        System.out.println("O percentual de acréscimo: "+acrescimo+"%");
    }
}