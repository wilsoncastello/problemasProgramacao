import java.util.Scanner;

public class Problema0102{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //Entrada
        int x, y, quadrante = 0;
        
        System.out.println("Digite um número para a abscissa: ");
        x = input.nextInt();
        System.out.println("Digite um número para a coordenada: ");
        y = input.nextInt();

        //Processamento
        if(x >= 0 && y >= 0){
            quadrante = 1;
        }else if(x < 0 && y >= 0){
            quadrante = 2;
        }else if(x < 0 && y < 0){
            quadrante = 3;
        }else if(x >= 0 && y < 0){
            quadrante = 4;
        }
            
        //Saída
        System.out.println("O ponto está localizado no "+ quadrante +"º quadrante");
    }
}
    