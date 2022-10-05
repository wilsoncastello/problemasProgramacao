import java.util.Scanner;
public class problema0164 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        float vTotalVista=0, vTotalPrazo=0, vTotal=0, v1Prestacao=0;

        for(int i=0;i<15;i++){
            System.out.println("Escreve Codigo: ");
            String codigo = input.nextLine();
            System.out.println("Valor transacao: ");
            float valor = Float.parseFloat(input.nextLine());

            if(codigo.equals("V")){
                vTotalVista = valor + vTotalVista;
                vTotal = valor + vTotal;

            }else if(codigo.equals("P")){
                vTotalPrazo = valor + vTotalPrazo;
                vTotal = valor + vTotal;
                float p1 = valor/3;
                v1Prestacao = p1 + v1Prestacao;
            }
        }

        System.out.println("Valor total transacao vista: "+vTotalVista);
        System.out.println("Valor total trasacao a prazo: "+vTotalPrazo);
        System.out.println("Valor total da transacoes: "+vTotal);
        System.out.println("Valores total primeiras parcelas: "+v1Prestacao);

    }
}