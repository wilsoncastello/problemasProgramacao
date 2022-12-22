import java.util.Scanner;
public class Problema0115 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double salarioBruto, valorPrestacao, valorMaximo;
        
        System.out.print("Digite o salário bruto: ");
        salarioBruto = Double.valueOf(input.nextLine());
        
        System.out.print("Digite o valor da prestação: ");
        valorPrestacao = Double.valueOf(input.nextLine());
        
        valorMaximo = ( salarioBruto*30 )/100;
        
        if(valorPrestacao > valorMaximo){
            System.out.println("O empréstimo não pode ser concedido.");
        }else{
            System.out.println("O empréstimo pode ser concedido.");
        }
    }  
}