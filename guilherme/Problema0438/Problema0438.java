import java.util.Scanner;

public class Problema0438{
    static Scanner input = new Scanner(System.in);

    public static int triangulo(int a, int b, int c){
        int x = 0;
        if(a + b > c && a + c > b && b + c > a){
            if(a == b && b == c){
                x = 1;
            }else if(a == b && b != c || a == c && a != b || b == c && c != a){
                x = 2;
            }else if(a != b && a != c && b != c){
                x = 3;
            }
        }
        return x;
    }

    public static void main(String[] args) {
        int a, b, c;
        System.out.println("Digite o primeiro lado: ");
        a = Integer.valueOf(input.nextLine());
        System.out.println("Digite o segundo lado: ");
        b = Integer.valueOf(input.nextLine());
        System.out.println("Digite o terceiro lado: ");
        c = Integer.valueOf(input.nextLine());
        if(triangulo(a, b, c) == 0)
            System.out.println("Não é um triângulo!");
        else if(triangulo(a, b, c) == 1)
            System.out.println("Triângulo Equilátero!");
        else if(triangulo(a, b, c) == 2)
            System.out.println("Triângulo Isóceles!");
        else if(triangulo(a, b, c) == 3)
            System.out.println("Triângulo Escaleno!");
    }
}