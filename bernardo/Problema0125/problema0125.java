import java.util.Scanner;

public class problema0125 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        // Declaração de variáveis
   String cidade;
   int aptos;
   int votos;
   int candidato;

        // Entrada de valores
        System.out.println("Digite a cidade: ");
        cidade = input.nextLine();
        System.out.println("Digite o número de votos aptos: ");
        aptos = Integer.valueOf(input.nextLine());
        System.out.println("Digite o número de pessoas que votaram: ");
        votos = Integer.valueOf(input.nextLine());
        System.out.println("Digite o número de votos do candidato mais votado: ");
        candidato = Integer.valueOf(input.nextLine());


       
//Verificação de segundo turno e saída
System.out.println("Na cidade de " + cidade);
if (aptos > 200000 && candidato <= votos * 0.5) {
    System.out.println("Terá segundo turno");
}
else {
    System.out.println("Não terá segundo turno");
}
    }
}
