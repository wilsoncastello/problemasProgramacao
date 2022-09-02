import java.util.Scanner;

public class Problema0011 {

    public static void main(String[] args) {
        
        double a=0,quadrado=0,cubo=0,raizQuadrada=0,raizCubica=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Digite um numero positivo maior que zero: ");
        a=Double.valueOf(input.nextLine());
        input.close();

        
        quadrado=a*a;
        cubo=a*a*a;
        raizQuadrada=Math.sqrt(a);
        raizCubica=Math.cbrt(a);
        
        System.out.println(a+" ao quadrado: "+quadrado);
        System.out.println(a+ " ao cubo: "+cubo);
        System.out.println("Raiz quadrada de "+a+ ": "+raizQuadrada);
        System.out.println("Raiz cubica de "+a+" : "+raizCubica);
        
        
        
        
    }
}