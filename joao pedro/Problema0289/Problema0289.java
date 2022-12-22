import java.util.Scanner;
public class Problema0289{

    public static void main(String[] args) {
        /*Crie um algoritmo que realize as reservas de passagens aéreas de uma companhia.O programa deve ler a quantidade de vôos,
        o número de cada vôo e a quantidade de lugares disponíveis nele. Em seguida, ele deve ler vários pedidos de reserva,
        constituído do número do vôo desejado. 
        Para cada pedido, o programa deve verificar se há possibilidade no vôo desejado. 
        O programa deve imprimir uma das duas mensagens: "Reserva efetuada" ou "Voo lotado". 
        O programa deve ser encerrado quando o usuário digitar -1 como o número do vôo a ser reservado.
        Neste momento, o programa deve imprimir uma relação com o número de cada vôo,
        a quantidade de passageiros que fizeram reserva naquele vôo e a quantidade de lugares que ficaram vagos. */
        Scanner input=new Scanner(System.in);
        int n=0;
        
        
        System.out.println("Digite a quantidade de voos: ");
        n=Integer.valueOf(input.nextLine());
        int x=0;
        int numero[]=new int[n];
        int lugares[]=new int[n];
        int vago[]=new int[n];
        int pedidos[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Digite o numero do voo "+i+": ");
            numero[i]=Integer.valueOf(input.nextLine());
            System.out.println("Digite a quantidade de lugares disponiveis no voo "+i+": ");
            lugares[i]=Integer.valueOf(input.nextLine());
            if(lugares[i]<=0){
                System.out.println("Voo lotado");
            }
            for(int j=0;j<lugares[i];j++){
                System.out.println("Deseja realizar uma reserva para o voo "+i+" ?([1]Sim/[2]Nao/[-1]Para encerrar]): ");
                x=Integer.valueOf(input.nextLine());
                if(x==1){
                    pedidos[i]++;
                    System.out.println("** Pedido efetuado **");
                }
                if(x==-1){
                    System.out.println("** Encerrando programa **");
                    return;
                }
                
            }
            

        }
        for(int i=0;i<n;i++){
            vago[i]=lugares[i]-pedidos[i];
            System.out.println("Numero do voo: "+numero[i]+". Passageiros: "+pedidos[i]+". Lugares vagos: "+vago[i]);
        }
    }
}