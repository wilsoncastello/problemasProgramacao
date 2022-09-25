import java.util.Scanner;

public class problema0128 {

    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    float saldoMedio, credito;
    System.out.println("Digite seu saldo médio do último ano:");
    saldoMedio = Float.valueOf(input.nextLine());
        if(saldoMedio < 0){
            System.out.println("Valor inválido, tente novamente!");
        }
        else if(saldoMedio >= 0 && saldoMedio <= 500){
            System.out.println("O seu saldo médio é "+saldoMedio+" e você não possui nenhum crédito.");
        }
        else if(saldoMedio >= 501 && saldoMedio <= 1000){
            credito = saldoMedio * 30 / 100;
            System.out.println("O seu saldo médio é "+saldoMedio+" e você possui um crédito de: "+credito);
            } 
        else if(saldoMedio >= 1001 && saldoMedio <= 3000){
            credito = saldoMedio * 40 / 100;
            System.out.println("O seu saldo médio é "+saldoMedio+" e você possui um crédito de: "+credito);
        }   
        else if(saldoMedio > 3000){
            credito = saldoMedio * 50 / 100;
            System.out.println("O seu saldo médio é "+saldoMedio+" e você possui um crédito de: "+credito);
        }
    }
}