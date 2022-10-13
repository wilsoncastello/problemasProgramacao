import java.util.Scanner;
public class problema0224 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        float arrecado=0;

        for(int i=0;i<10;i++){
            System.out.println("Escrever Nome cliente: ");
            String nome = input.nextLine();
            System.out.println("Valor a pagar: ");
            float pagar = Float.parseFloat(input.nextLine());

            if( pagar >= 250){
                System.out.println("Nome cliente: "+nome);
                System.out.println("Valor compar: "+pagar);
                System.out.println("Desconto: 20%");
                float pDescontado = (pagar*80)/100;
                System.out.println("Valor descontado: "+pDescontado);
                arrecado = arrecado + ((pagar*20)/100);

            }else{
                System.out.println("Nome cliente: "+nome);
                System.out.println("Valor compar: "+pagar);
                System.out.println("Desconto: 15%");
                float pDescontado = (pagar*85)/100;
                System.out.println("Valor descontado: "+pDescontado);
                arrecado = arrecado + ((pagar*15)/100);
            }
            

        }

        System.out.println("Total arrecado: "+arrecado);
    }
}