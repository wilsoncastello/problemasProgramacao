import java.util.Scanner;
public class Problema0100 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int idade;
        
        System.out.print("Digte a idade do nadador: ");
        idade = Integer.parseInt(input.nextLine());
        
        if (idade > 60) {
            System.out.println("Categoria Senior");
        }else if (idade > 18) {
            System.out.println("Categoria Adulto");
        }else if (idade > 11) {
            System.out.println("Categoria Juvenil");
        }else if (idade > 5) {
            System.out.println("Categoria Infantil");
        }else{
            System.out.println("Sem Categoria");
        }
    }