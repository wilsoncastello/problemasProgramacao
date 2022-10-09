import java.util.Scanner;

public class problema0174 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);      
        int idade, pessoas = 0, maioridade = 0, menorIdade = 200, mulheresAte2000 = 0, idadeMenorSalario = 0;
        char genero, generoMenorSalario = 0;
        float salario, somaSalarios = 0, mediaSalarios, menorSalario = 999999;
        do{
        System.out.println("Digite sua idade: (Digite um valor negativo para sair do programa!):");
        idade = Integer.valueOf(input.nextLine());
        if(idade < 0){
        break;
        }
        System.out.println("Digite seu gênero (M = Masculino; F = Feminino):");
        genero = input.nextLine().charAt(0);
        System.out.println("Digite seu salário:");
        salario = Float.valueOf(input.nextLine());
        somaSalarios = somaSalarios + salario;
        pessoas++;
        if(idade > maioridade){
            maioridade = idade;
        }
        if(idade < menorIdade){
            menorIdade = idade;
        }
        if(genero == 'F' && salario <= 2000 || genero == 'f' && salario <= 2000){
            mulheresAte2000++;
        }
        if(salario < menorSalario){
            menorSalario = salario;
            generoMenorSalario = genero;
            idadeMenorSalario = idade;
        }
        } while (idade >= 0);
        mediaSalarios = somaSalarios / pessoas;
        System.out.println("A média de todos os salário é: "+mediaSalarios);
        System.out.println("A maior idade do grupo é "+maioridade+" e a menor é "+menorIdade);
        System.out.println("A quantiade de mulheres com salário até R$ 2000,00 é: "+mulheresAte2000);
        System.out.println("A idade da pessoa que possui o menor salário é "+idadeMenorSalario+" e ela é do gênero "+generoMenorSalario);
    }
}