package stephanie.Problema0186;

import java.lang.*;

public class Problema0186 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for(int i=0; i<8; i++){
            System.out.print("Digite um número:");
            double x = Double.parseDouble(input.nextLine());
            System.out.print("O logaritmo de base 10 do número "+x+" é: "+Math.log10(x));
        }
    }
}
