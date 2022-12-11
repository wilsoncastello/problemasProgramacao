import java.util.Scanner;

public class problema0145{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double salario, salarioMes, salarioBruto, depSalario, horasTrabalho = 0, horasExtra = 0, horasExtraTrabalhada, hora, imposto = 0, salarioLiquido, salarioFinal;
        int dependentes;

        System.out.print("Digite o salário minímo: ");
        salario = Double.parseDouble(input.nextLine());

        System.out.print("Digite as horas trabalhadas: ");
        horasTrabalho = Integer.parseInt(input.nextLine());

        System.out.print("Digite a quantidade de dependentes: ");
        dependentes = Integer.parseInt(input.nextLine());

        System.out.print("Digite as horas extras : ");
        horasExtraTrabalhada = Integer.parseInt(input.nextLine());

        hora = salario / 5;
        
        salarioMes = horasTrabalho * hora;
        
        depSalario = dependentes * 200;
        
        horasExtra = horasExtraTrabalhada * (hora + hora * 50 / 100);
        
        salarioBruto = salarioMes + depSalario + horasExtra;

        if (salarioBruto <= 2000){
            System.out.println("Isento de imposto.\n\tSalario bruto: "+salarioBruto);
        } else {
            if (salarioBruto <= 5000){
                imposto = salarioBruto * 15 / 100;
            } else {
                imposto = salarioBruto * 27.5 / 100;
            }
        }

        salarioLiquido = salarioBruto - imposto;

        if (salarioLiquido < 3000){
            salarioFinal = salarioLiquido + 1000;
            System.out.println("Salário final: "+salarioFinal);
        } else {
            salarioFinal = salarioLiquido + 500;
            System.out.println("Salário final: "+salarioFinal);
        }
    }
}