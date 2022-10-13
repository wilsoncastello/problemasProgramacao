import java.util.Scanner;

public class problema0234 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n, numeroSequencia = 8, numeroSequenciaSoma, numeroSequenciaMultiplicacao, elementoControle = 0;    
        System.out.println("Digite um número inteiro:");
        n = Integer.valueOf(input.nextLine());
        System.out.println(numeroSequencia);
        while(numeroSequencia < n && elementoControle < n){
            numeroSequenciaSoma = numeroSequencia + 2;
            System.out.println(numeroSequenciaSoma);
            numeroSequenciaMultiplicacao = numeroSequencia * 2;
            System.out.println(numeroSequenciaMultiplicacao);
            numeroSequencia = numeroSequenciaMultiplicacao;
            elementoControle = numeroSequencia * 2;
        }
    }
}