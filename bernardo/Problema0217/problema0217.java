import java.util.Scanner;

public class problema0217 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Entrada de valores e verificação do peso dos bois
        int numero = 0;
        float peso = 0;
        float maiorPeso = 0;
        int boiGordo = 0;
        float menorPeso = 0;
        int boiMagro = 0;
        var registrado = false;

        System.out.println("Digite o número de identificação do boi " +
                "(digite 0 ou menos para finalizar): ");
        numero = Integer.valueOf(input.nextLine());
        if (numero > 0) {
            registrado = true;
            System.out.println("Digite o peso do boi: ");
            peso = Float.valueOf(input.nextLine());
            maiorPeso = peso;
            boiGordo = numero;
            menorPeso = peso;
            boiMagro = numero;
        }

        while (numero > 0) {
            System.out.println("Digite o número de identificação do boi " +
                    "(digite 0 ou menos para finalizar): ");
            numero = Integer.valueOf(input.nextLine());
            if (numero > 0) {
                System.out.println("Digite o peso do boi: ");
                peso = Float.valueOf(input.nextLine());
                if (peso >= maiorPeso) {
                    maiorPeso = peso;
                    boiGordo = numero;
                }
                if (peso <= menorPeso) {
                    menorPeso = peso;
                    boiMagro = numero;
                }
            }
        }

        // Saída
        if (registrado) {
            System.out.println("O boi " + boiGordo + " é o mais gordo e seu peso é: " +
                    maiorPeso);
            System.out.println("O boi " + boiMagro + " é o mais magro e seu peso é: " +
                    menorPeso);
        } else {
            System.out.println("Não houve registro de bois");
        }
    }
}
