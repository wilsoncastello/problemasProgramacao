import java.util.Scanner;

public class Problema0215{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float saldo, valOp;
        int codOP;
        
        System.out.print("Digite o seu saldo: ");
        saldo = Float.valueOf(input.nextLine());
        System.out.println("Escolha a operação");
        System.out.println("");
        System.out.println("Caso queira parar (codigo = 0)");
        System.out.println("Pagamento de cheque (código = 4)");
        System.out.println("Saque em dinheiro (código = 10)");
        System.out.println("Depósito (código = 33)");
        System.out.println("");
        System.out.print("Digite o código da operação: ");
        codOP = Integer.valueOf(input.nextLine());

        while(codOP != 0){
            System.out.println("");
            System.out.print("Digite o valor da operação: ");
            valOp = Float.valueOf(input.nextLine());
            
            if(codOP != 4 && codOP != 10 && codOP !=33){
                System.out.println("Código inválido");
            }
            else{ 
                if(codOP == 4){
                    saldo = saldo + valOp;
                    System.out.println("Operação feita com êxito");
                }
                else{
                    if(codOP == 10){
                        saldo = saldo - valOp;
                        System.out.println("Operação feita com êxito");
                    }
                    else{
                        saldo = saldo + valOp;
                        System.out.println("Operação feita com êxito");
                    }
                }
            }

            System.out.println("Escolha a operação");
            System.out.println("");
            System.out.println("Caso queira parar (codigo = 0)");
            System.out.println("Pagamento de cheque (código = 4)");
            System.out.println("Saque em dinheiro (código = 10)");
            System.out.println("Depósito (código = 33)");
            System.out.println("");
            System.out.print("Digite o código da operação: ");
            codOP = Integer.valueOf(input.nextLine());
        }

        System.out.println("");
        if(saldo < 0){
            System.out.println("Saldo negativo");
        }
        else{
            System.out.println("Saldo positivo");
        }
        System.out.println("Novo saldo: "+saldo);
    }
}