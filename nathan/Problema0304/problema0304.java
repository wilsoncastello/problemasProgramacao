package Problema0304;

import java.util.Scanner;

public class problema0304 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int vCodigo[] = new int[50];
        String vNome[] = new String[50];
        int vQuant[] = new int[50];
        int vPreco[] = new int [50];   
        String auxNome;
        int i = 0, auxQuant, auxCodigo, auxPreco, nProdutos = 0;
        double somaVendas = 0;
        boolean produtoVendido = false;

        System.out.println("Digite o código do produto(-1 Para cancelar): ");
        vCodigo[i] = Integer.valueOf(input.nextLine());

        while(vCodigo[i] != -1){
            nProdutos++;
            System.out.println("Digite o nome do produto: ");
            vNome[i] = input.nextLine();
            System.out.println("Digite a quantidade em estoque: ");
            vQuant[i] = Integer.valueOf(input.nextLine());
            System.out.println("Digite o preço de venda: ");
            vPreco[i] = Integer.valueOf(input.nextLine());
            i++;

            System.out.println("Digite o código do produto(-1 Para cancelar): ");
            vCodigo[i] = Integer.valueOf(input.nextLine());
        }

        System.out.println("Digite o código do produto para realizar a venda(0 para cancelar): ");
        int codigo = Integer.valueOf(input.nextLine());

        while(codigo != 0){
            System.out.println("Digite a quantidade requerida: ");
            int quant = Integer.valueOf(input.nextLine());
            for (int j = 0; j < 50; j++) {
                if(codigo == vCodigo[j]){
                    produtoVendido = true;
                    if(quant <= vQuant[j]){
                        vQuant[j] = vQuant[j] - quant;
                        somaVendas = somaVendas + (vPreco[j] * quant);
                        System.out.println("Venda do " + vNome[j] + " com sucesso.");
                    }else{
                        System.out.println("Estoque insuficiente.");
                    }
                    break;
                }
            }
            if(produtoVendido = false)
                System.out.println("Produto nao cadastrado");

            System.out.println("Digite o código do produto para realizar a venda(0 para cancelar): ");
            codigo = Integer.valueOf(input.nextLine());
        }
        System.out.println("Total vendido: " + somaVendas);
        for (int j = 0; j < nProdutos; j++) {
            for (int k = 0; k < nProdutos; k++) {
                if (vQuant[j] > vQuant[k]) {
                    auxCodigo = vCodigo[j];
                    vCodigo[j] = vCodigo[k];
                    vCodigo[k] = auxCodigo;

                    auxNome = vNome[j];
                    vNome[j] = vNome[k];
                    vNome[k] = auxNome;

                    auxQuant = vQuant[j];
                    vQuant[j] = vQuant[k];
                    vQuant[k] = auxQuant;

                    auxPreco = vPreco[j];
                    vPreco[j] = vPreco[k];
                    vPreco[k] = auxPreco;
                }
            }
        }
        for (int j = 0; j < nProdutos; j++) {
            System.out.println(vCodigo[j] + " " + vNome[j] + " " + vQuant[j] + " " + vPreco[j]);
        }
    }
    
}
