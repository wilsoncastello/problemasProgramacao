import java.util.Scanner;

public class problema0321 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nome;
        System.out.println("Digite um nome: ");
        nome = input.nextLine();
        System.out.println("O nome digitado: "+nome);
        System.out.println("O primeiro caracter digitado: "+nome.charAt(0));
        System.out.println("O último caracter digitado: "+nome.charAt(nome.length()-1));
        System.out.println("O primeiro até o terceiro caracter digitdo: "+nome.substring(0,3));
        if(nome.length() < 3){
            System.out.println("O nome digitado posui menos de 4 caracteres");
        }
        else
            System.out.println("O quarto caracter digitado: "+nome.charAt(3));
        System.out.println("Os dois últimos caracteres digitdos: "+nome.substring(nome.length()-2,nome.length()));
    }
}