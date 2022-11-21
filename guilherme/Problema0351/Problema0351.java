import java.util.Scanner;

public class Problema0351{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String frase;
        char x;
        int cont = 0;
        System.out.println("Digite uma frase: ");
        frase = input.nextLine();
        System.out.println("Digite um caractere para buscar na frase: ");
        x = input.nextLine().charAt(0);
        for(int i = 0; i < frase.length(); i++){
            if(frase.charAt(i) == x)
                cont++;
        }
        if(cont == 1){
            System.out.println("\'" + x + "\' é encontrado na frase.");
            System.out.print("É encontrado na posição: ");
            for(int i = 0; i < frase.length(); i++){
                if(frase.charAt(i) == x)
                    System.out.print(i + "; ");
            }
            
        }else if(cont > 1){
            System.out.println("\'" + x + "\' é encontrado na frase " + cont + " vezes.");
            System.out.print("Pode se encontrado nas posições: ");
            for(int i = 0; i < frase.length(); i++){
                if(frase.charAt(i) == x)
                    System.out.print(i + "; ");    
            }
        }else{
            System.out.println("\'" + x + "\' não pode ser encontrado na frase.");
        }
    }
}