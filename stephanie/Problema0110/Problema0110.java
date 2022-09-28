package stephanie.Problema0110;

import java.util.Scanner;

public class Problema0110 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um peso na Terra: ");
        double peso = Double.valueOf(input.nextLine());
        
        System.out.println("1 - Mercúrio");
        System.out.println("2 - Vênus");
        System.out.println("3 - Marte");
        System.out.println("4 - Júpiter");
        System.out.println("5 - Saturno");
        System.out.println("6 - Urano");
        System.out.println("7 - Netuno");
        System.out.println("Digite o número de um planeta: ");
        int n = Integer.valueOf(input.nextLine());

        switch (n){
            case 1: System.out.print("Peso em Mercúrio: "+peso*0.37);
            break;
            case 2: System.out.print("Peso em Vênus: "+peso*0.88);
            break;
            case 3: System.out.print("Peso em Marte: "+peso*0.38);
            break;
            case 4: System.out.print("Peso em Júpiter: "+peso*2.64);
            break;
            case 5: System.out.print("Peso em Saturno: "+peso*1.15);
            break;
            case 6: System.out.print("Peso em Urano: "+peso*1.17);
            break;
            case 7: System.out.print("Peso em Netuno: "+peso*1.18);
            break;
            default: System.out.print("Entrada Inválida!");
            break;
        }
    }
}
