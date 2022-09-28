import java.util.Scanner;
public class Problema0109{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int op;
        float num1, num2;
        float valFinal = 0;

        System.out.println("Escolha uma das operações a baixo (1, 2, 3 ou 4)");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Digite a sua opção: ");
        op = Integer.valueOf(input.nextLine());

        if(op > 4 || op < 1){
            System.out.println("Digite um valor de operação válido");
        }
        else{
            System.out.print("Digite o valor do primeiro numero: ");
            num1 = Float.valueOf(input.nextLine());
            System.out.print("Digite o valor do segundo numero: ");
            num2 = Float.valueOf(input.nextLine());
        
            if(op == 1){
                valFinal = num1 + num2;
            }
            else{
                if(op == 2){
                    valFinal = num1 - num2;
                }
                else{
                    if(op == 3){
                        valFinal = num1 * num2;
                    }
                    else{
                        valFinal = num1 / num2;
                    }
                }
            }
        }

        System.out.println("Valor final: "+valFinal);

    }
}