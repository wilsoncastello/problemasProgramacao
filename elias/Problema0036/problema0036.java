import java.util.Scanner;

public class problema0036{

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        float angulo1, angulo2, angulo3;
        System.out.print("Digite a medida do primeiro ângulo:");
        angulo1 = Float.valueOf(input.nextLine());
        System.out.print("Digite a medida do segundo ângulo:");
        angulo2 = Float.valueOf(input.nextLine());
        angulo3 = 180 - angulo1 - angulo2;
        System.out.println("A medida do terceiro ângulo é: "+angulo3);
    }
}