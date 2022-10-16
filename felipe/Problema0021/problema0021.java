import java.util.Scanner;

public class problema0021 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Double numero, parteFracionaria;
        long numeroArredondado;
        int parteInteira;

        System.out.print("Coloque aqui um número real (Use . ao inves de , ). \nDigite: ");
        numero = Double.parseDouble(input.nextLine());

        parteInteira = numero.intValue();
        System.out.println("Parte inteira: " + parteInteira);

        parteFracionaria = numero - parteInteira;
        System.out.println("Parte fracionária: " + parteFracionaria);

        numeroArredondado = Math.round(numero);
        System.out.println("Número arredondado: " + numeroArredondado);
    }
}
