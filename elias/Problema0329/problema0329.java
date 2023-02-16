import java.util.Scanner;

public class problema0329 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nome;
        System.out.println("Digite um nome completo: ");
        nome = input.nextLine();
        while(nome != "@"){
            System.out.println("Digite um nome completo: ");
            nome = input.nextLine();
        }
    }
}