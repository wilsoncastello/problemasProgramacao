import java.util.Scanner;

public class Problema0132{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String destino;
        boolean retorno = false;
        System.out.println("DESTINO");
        System.out.println("N - Região Norte");
        System.out.println("NE - Região Nordeste");
        System.out.println("CO - Região Centro-Oeste");
        System.out.println("S - Região Sul");
        System.out.print("\nDigite o seu destino: ");
        destino = input.nextLine();
        System.out.print("Viagem de ida e volta(true ou false): ");
        retorno = Boolean.valueOf(input.nextLine());

        if(destino.equalsIgnoreCase("n") && retorno == false){
            System.out.println("Valor: R$500,00");
        }else if(destino.equalsIgnoreCase("n") && retorno == true){
            System.out.println("Valor: R$900,00");
        }else if(destino.equalsIgnoreCase("ne") && retorno == false){
            System.out.println("Valor: R$350,00");
        }else if(destino.equalsIgnoreCase("ne") && retorno == true){
            System.out.println("Valor: R$650,00");
        }else if(destino.equalsIgnoreCase("co") && retorno == false){
            System.out.println("Valor: R$350,00");
        }else if(destino.equalsIgnoreCase("co") && retorno == true){
            System.out.println("Valor: R$600,00");
        }else if(destino.equalsIgnoreCase("s") && retorno == false){
            System.out.println("Valor: R$300,00");
        }else if(destino.equalsIgnoreCase("s") && retorno == true){
            System.out.println("Valor: R$550,00");
        }else{
            System.out.println("Região Indisponível ou não existente");
        }
    }
}