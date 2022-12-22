import java.util.Scanner;

public class Problema0238{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n, codigo, x, resultado, resto, div;
        int somaParcelas, restoParcelas, digitoVerificador;
        System.out.print("Digite o número de Códigos: ");
        n = Integer.valueOf(input.nextLine());
        for (int i = 1; i <= n; i++) {
            resultado = 0;
            resto = 0;
            div = 10000;
            x = 6;
            somaParcelas = 0;
            System.out.print("Digite o " + i + " Código com 5 Dígitos: ");
            codigo = Integer.valueOf(input.nextLine());
            for (int j = 0; j < 5; j++) {
                if (j == 0) {
                    resultado = codigo / div;
                    resto = codigo % div;
                    div /= 10;
                    somaParcelas += (x * resultado);
                    x--;
                } else {
                    resultado = resto / div;
                    resto = resto % div;
                    div /= 10;
                    somaParcelas += (x * resultado);
                    x--;
                }
            }
            System.out.println("Somatório das Parcelas: " + somaParcelas);
            restoParcelas = somaParcelas % 11;
            digitoVerificador = 11 - restoParcelas;
            if (digitoVerificador == 10 || digitoVerificador == 11) {
                digitoVerificador = 0;
            }
            System.out.println("Digito Verificador(" + i + "): " + digitoVerificador + "\n");
        }
    }
}