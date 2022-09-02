package fernanda.Problema0006;

import java.util.Scanner;

public class Problema0006 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Double salario, novoSalario;
        
        System.out.print("Digite o valor do salário: ");
        salario = Double.valueOf(input.nextLine());
        
        novoSalario = salario + (salario*0.25);
        
        System.out.print("O valor do salário atualizado é: "+novoSalario);
    }
    
}
