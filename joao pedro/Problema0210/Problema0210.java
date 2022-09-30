import java.util.Scanner;

public class Problema0210 {
    public static void main(String[] args) {
        int x;
        String tipo;
        double valor,totalV=0,totalP=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Digite a quantidade de produtos comprados: ");
        x=Integer.valueOf(input.nextLine());
        
        for(int i=0;i<x;i++){
            System.out.println("Digite tipo de compra para o produto "+i+" ('v' para compras a vista/ 'p' para compras a prazo/ 'x' para encerrar o programa'): ");
            tipo=input.nextLine();
            if(tipo.equalsIgnoreCase("x")){
                System.out.println("--Finalizando programa--");
                return;
            }

            System.out.println("Digite o valor da compra do produto "+i+": ");
            valor=Double.valueOf(input.nextLine());
            if(tipo.equalsIgnoreCase("v")){
                totalV=totalV+valor;
            }
            if(tipo.equalsIgnoreCase("p")){
                totalP=totalP+valor;
            }
            

        
        }
        System.out.println("Total a vista: "+totalV);
            System.out.println("Total a prazo: "+totalP);
            
    }







}