import java.util.Scanner;

public class problema0017{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
        float salarioBase;
        float salario;
        
        //Entrada de valores
        System.out.println("Digite o salário base: ");
        salarioBase = Float.valueOf(input.nextLine());
        
        //Cálculo do salário a receber
        salario =  salarioBase - (salarioBase / 10) + 50;

        //Saída 
        System.out.println("Salário a receber: R$" + Math.round(salario * 100d) / 100d);
    }
}
