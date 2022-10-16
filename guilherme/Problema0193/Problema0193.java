import java.util.Scanner;

public class Problema0193{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int x, y, z, n;
        System.out.print("Digite o limite inferior: ");
        x = Integer.valueOf(input.nextLine());
        System.out.print("Digite o limite superior: ");
        y = Integer.valueOf(input.nextLine());
        System.out.print("Digite o número cujos multiplos serão impressos: ");
        n = Integer.valueOf(input.nextLine());
        for(int i = 0; i <= y; i++){
            z = i * n;
            if(z >= x && z <= y)
                System.out.println(z);
        }
    }
}