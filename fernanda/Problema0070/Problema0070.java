import java.util.Scanner;
public class Problema0070 {

    Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        int A, B;
        boolean multiplo;
    
        System.out.print("Digite o primeiro número: ");
        A = Integer.valueOf(input.nextLine());
        System.out.print("Digite o segundo número: ");
        B = Integer.valueOf(input.nextLine());
        
        multiplo = (A % B == 0 || B % A == 0);
        
        System.out.println(A+" e "+B+" são múltiplos: "+multiplo);
    }
}