package problemasProgramacao.cristopher.Problema0285;

import java.util.Scanner;

public class problema0285 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float [] vetorLucros = new float[10];
        float precoCompra = 0, precoVenda = 0;
        int contLucroMenor10 = 0, contLucroEntre10e20 = 0, contLucroMaior20 = 0;

        for (int i = 0; i < vetorLucros.length; i++) {
            System.out.print("Digite o preço de compra do produto ["+i+"]: ");
            precoCompra = Float.valueOf(input.nextLine());
            System.out.print("Digite o preço de venda do produto ["+i+"]: ");
            precoVenda = Float.valueOf(input.nextLine());
            vetorLucros[i] = precoVenda - precoCompra;

            if(vetorLucros[i] < (precoCompra * 10/100)){
                contLucroMenor10++;
            }else if(vetorLucros[i] >= (precoCompra * 10/100) && vetorLucros[i] <= (precoCompra * 20/100)){
                contLucroEntre10e20++;
            }else{
                contLucroMaior20++;
            }
        }

        System.out.println(contLucroMenor10);
        System.out.println(contLucroEntre10e20);
        System.out.println(contLucroMaior20);

        input.close();
        
    }
    
}
