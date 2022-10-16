import java.util.Scanner;
public class problema0005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double raio, area;

        System.out.print("Digite o raio do círculo em cm: ");
        raio = Double.parseDouble(input.nextLine());

        area = Math.PI * Math.pow(raio, 2);

        System.out.print("A área deste círculo é de: " + area);
    }

} 