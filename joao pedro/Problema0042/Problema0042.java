import java.util.Scanner;

public class Problema0042 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double angulo=0,seno=0,cosseno=0,tangente=0,secante=0,cossecante=0,cotangente=0;
        System.out.println("Digite um angulo: ");
        angulo=Double.valueOf(input.nextLine());
        seno=Math.sin(Math.toRadians(angulo));
        cosseno=Math.cos(Math.toRadians(angulo));
        tangente=Math.tan(Math.toRadians(angulo));
        secante=Math.pow(cosseno, -1);
        cossecante=Math.pow(seno,-1);
        cotangente=Math.pow(tangente,-1);

        System.out.println("Seno de "+angulo+": "+seno);
        System.out.println("Cosseno de "+angulo+": "+cosseno);
        System.out.println("Tangente de "+angulo+": "+tangente);
        System.out.println("Secante de "+angulo+": "+secante);
        System.out.println("Cossecante de "+angulo+": "+cossecante);
        System.out.println("Cotangente de "+angulo+": "+cotangente);
    }
}
