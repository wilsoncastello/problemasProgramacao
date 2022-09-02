import java.util.Scanner;
public class problema0041 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("escreve o dividendo: ");
        int x = input.nextInt();
        System.out.println("escreve o divisor: ");
        int y = input.nextInt();

        int z = x / y;
        int w = x % y;

        System.out.println("Dividendo: "+x);
        System.out.println("Divisor: "+y);
        System.out.println("Quociente: "+z);
        System.out.println("Resto: "+w);
    }
}
