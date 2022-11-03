import java.util.Scanner;

public class problema0190{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lim, incr;
        
        System.out.print("Digite o limite superior maior que 0: ");
        lim = Integer.parseInt(input.nextLine());

        System.out.print("Digite o incremento, maior que 0: ");
        incr = Integer.parseInt(input.nextLine());

        for(int i = 0; i <= lim/incr; i++){
            System.out.print(i*incr+" ");
        }
    }
}