package stephanie.Problema0064;

import java.util.Scanner;

public class Problema0064 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Quantos quilos de café você comprou? ");
    double n = Double.valueOf(input.nextLine());
    System.out.print("Qual era o valor unitário do café? ");
    double q = Double.valueOf(input.nextLine());
    System.out.print("Quantos litros de leite você comprou? ");
    double l = Double.valueOf(input.nextLine());
    System.out.print("Qual era o valor unitário do leite? ");
    double p = Double.valueOf(input.nextLine());
    System.out.print("Quantos quilos de banana você comprou? ");
    double b = Double.valueOf(input.nextLine());
    System.out.print("Qual era o valor unitário da banana? ");
    double t = Double.valueOf(input.nextLine());

    double nq = n * q;
    double lp = l * p;
    double bt = b * t;
    double total = nq + lp + bt;

    System.out.println("");
    System.out.println("Total gasto com café: "+nq);
    System.out.println("Total gasto com leite: "+lp);
    System.out.println("Total gasto com banana: "+bt);
    System.out.println("");
    System.out.println("Total gasto: "+total);
    
}
}