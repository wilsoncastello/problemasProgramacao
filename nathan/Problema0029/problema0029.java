import java.util.Scanner;
public class problema0029{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor do salário mínimo: ");
        double salarioMinimo = Double.valueOf(input.nextLine());
        System.out.println("Digite o valor do salário do funcionário: ");
        double salarioFuncionario = Double.valueOf(input.nextLine());
        double quantSalarioMinimos = salarioFuncionario / salarioMinimo;
        System.out.println("Quantidade de salários mínimos que o funcionario ganha: " + quantSalarioMinimos);
    }
}
