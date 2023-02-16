import java.util.Scanner;
public class Problema0146 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nome1, nome2;
        int comparacao;
        
        System.out.print("Digite o primeiro nome: ");
        nome1 = input.nextLine();
        
        System.out.print("Digite o segundo nome: ");
        nome2 = input.nextLine();
        
        comparacao = nome1.compareToIgnoreCase(nome2);
        
        if(comparacao < 0){
            System.out.println(nome1 +", "+ nome2);        
        }else if(comparacao > 0){
            // o nome1 vem depois do nome2
            System.out.println(nome2 +", "+ nome1);
        }else {
            System.out.println("Mesma Inicial: "+ nome1 +", "+ nome2);
        }
    }
}