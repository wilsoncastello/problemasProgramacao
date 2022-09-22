import java.util.Scanner;

public class problema0033{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        float altura;
        float largura;
        float area;
        float potencia;
        
        //Entrada de valores
        System.out.println("Digite a altura (em metros): ");
        altura = Float.valueOf(input.nextLine());
        System.out.println("Digite a largura (em metros): ");
        largura = Float.valueOf(input.nextLine());
       
        
        //Cálculo da área e pot^ncia de iluminação
        area = altura * largura;
        potencia = area * 18;

        //Saída 
        System.out.println("Área: " + area + "m²");
        System.out.println("Potência: " + potencia + " W");
    }
}
