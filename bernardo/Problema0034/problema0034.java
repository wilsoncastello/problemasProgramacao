import java.util.Scanner;

public class problema0034{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        float horaE;
        float salarioMinimo;
        float horaT;
        float salarioBruto;
        float quantiaExtra;
        float salario;
        
        //Entrada de valores
        System.out.println("Digite o número de horas trabalhadas: ");
        horaT = Float.valueOf(input.nextLine());
        System.out.println("Digite o salário mínimo: ");
        salarioMinimo = Float.valueOf(input.nextLine());
        System.out.println("Digite o número de horas extras: ");
        horaE = Float.valueOf(input.nextLine());
        
        //Cálculo do salário a receber
        salarioBruto = horaT * (salarioMinimo / 8);
        quantiaExtra = horaE * (salarioMinimo / 4);
        salario = salarioBruto + quantiaExtra;

        //Saída 
        System.out.println("Salário a receber: R$" + Math.round(salario * 100d) / 100d);
    }
}
