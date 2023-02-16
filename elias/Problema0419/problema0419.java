import java.util.Scanner;

public class problema0419 {

    public static void descreveMes(){
        Scanner input = new Scanner (System.in);
        int numero;
        System.out.println("Digite um número correspondente a um mês:");
        numero = Integer.valueOf(input.nextLine());
        switch(numero){
            case 1:
                System.out.println("O número digitado corresponde ao mês de Janeiro");
                break;
            case 2:
                System.out.println("O número digitado corresponde ao mês de Fevereiro");
                break;
            case 3:
                System.out.println("O número digitado corresponde ao mês de Março");
                break;
            case 4:
                System.out.println("O número digitado corresponde ao mês de Abril");
                break;
            case 5:
                System.out.println("O número digitado corresponde ao mês de Maio");
                break;
            case 6:
                System.out.println("O número digitado corresponde ao mês de Junho");
                break;
            case 7:
                System.out.println("O número digitado corresponde ao mês de Julho");
                break;
            case 8:
                System.out.println("O número digitado corresponde ao mês de Agosto");
                break;
            case 9:
                System.out.println("O número digitado corresponde ao mês de Setembro");
                break;
            case 10:
                System.out.println("O número digitado corresponde ao mês de Outubro");
                break;
            case 11:
                System.out.println("O número digitado corresponde ao mês de Nuvembro");
                break;
            case 12:
                System.out.println("O número digitado corresponde ao mês de Dezembro");
                break;
            default:
                System.out.println("O número digitado não corresponde a nenhum mês!!");
        }
    }

    public static void main(String[] args) {
        descreveMes();
    }
}