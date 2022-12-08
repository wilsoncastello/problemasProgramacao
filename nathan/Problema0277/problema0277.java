package Problema0277;

import java.util.Scanner;

public class problema0277 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String vNome[] = new String [5];
        int vPreco[] = new int[5];
        int contPreco50 = 0, contPreco100 = 0;
        double somaPreco100 = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do " + (i+1) + "° produto: ");
            vNome[i] = input.nextLine();
            System.out.println("Digite seu preço: ");
            vPreco[i] = Integer.valueOf(input.nextLine());
        }
        for (int i = 0; i < 5; i++) {
            if(vPreco[i] < 50){
                contPreco50++;
            }
            if(vPreco[i] > 100){
                somaPreco100 = somaPreco100 + vPreco[i];
                contPreco100++;
            }
        }
        System.out.println("Produtos com preço entre 50R$ e 100R$: ");
        for (int i = 0; i < 5; i++) {
            if(vPreco[i] >= 50 && vPreco[i] <= 100){
                System.out.println(vNome[i]);
            }
        }
        System.out.println("\nQuantidade de produtos com preço inferior a 50R$: " + contPreco50);
        System.out.println("Media dos preços dos produtos com preço superior a 100R$: " + (somaPreco100 / contPreco100));
    }
}
