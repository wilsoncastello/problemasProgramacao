import java.util.Scanner;
public class problema0103 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("escreve o numero do dia atual: ");
        int diaAtual = input.nextInt();
        System.out.println("escreve o numero do mes atual: ");
        int mesAtual = input.nextInt();
        System.out.println("escreve o numero do ano atual: ");
        int anoAtual = input.nextInt();


        System.out.println("escreve o numero do dia: ");
        int dia = input.nextInt();
        System.out.println("escreve o numero do mes: ");
        int mes = input.nextInt();
        System.out.println("escreve o numero do ano: ");
        int ano = input.nextInt();

        if(anoAtual < ano){
            System.out.println("Nao esta vencida");
        }else if(anoAtual > ano){
            System.out.println("Esta vencida");
        }else{
            if(mesAtual < mes){
                System.out.println("Nao esta vencida");
            }else if(mesAtual > mes){
                System.out.println("Esta vencida");
            }else{
                if(diaAtual <= dia){
                    System.out.println("Nao esta vencida");
                }else {
                    System.out.println("Esta vencida");
                }
            }
        }

    }
}