import java.util.Scanner;

public class Problema0016{
    
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite quantos quilos de ração tem no saco: ");
    float racao = Float.valueOf(input.nextLine());
    System.out.println("Digite quantas gramas o gato 1 come de ração por dia: ");
    float gato1gr = Float.valueOf(input.nextLine());
    System.out.println("Digite quantas gramas o gato 2 come de ração por dia: ");
    float gato2gr = Float.valueOf(input.nextLine());

    float gato1kg = gato1gr/1000;
    float gato2kg = gato2gr/1000;
    float sobra = racao - ((gato1kg + gato2kg) * 5);
    System.out.println("Sobrará "+sobra+" no saco de ração após 5 dias.");
}

}