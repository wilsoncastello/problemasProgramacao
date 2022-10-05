import java.util.Scanner;

public class Problema0170{

    /*Cada espectador de um cinema respondeu a um questionário no qual constava sua idade e sua 
    opinião em relação ao filme:ótimo - 3 ; bom - 2 ; regular - 1. Faça um programa que receba 
    a idade e a opinião de quinze espectadores, calcule mostre:
    *A média das idades das pessoas que responderam ótimo; 
    *A quantidade de pessoas que responderam regular; 
    *A porcentagem de pessoas que responderam bom, entre todos os espectadores analisados.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int contPessoaOtimo = 0, contPessoaRegular = 0, contPessoaBom = 0;
        int somaIdade = 0;
        float mediaIdade = 0, porcentagemBom;
        int idade, opFilme;

        for(int i = 0; i < 15; i++){
            System.out.print("Digite a sua idade: ");
            idade = Integer.valueOf(input.nextLine());
            System.out.println("Qual a sua opnião do filme (ótimo - 3 ; bom - 2 ; regular - 1)?");
            System.out.print("Digite: ");
            opFilme = Integer.valueOf(input.nextLine());
            System.out.println("");
            if(opFilme == 3){
                contPessoaOtimo = contPessoaOtimo + 1;
                somaIdade = somaIdade + idade;   
                if(contPessoaOtimo > 0){
                    mediaIdade = somaIdade/contPessoaOtimo;
                }
            }
            else{
                if(opFilme == 1){
                    contPessoaRegular = contPessoaRegular + 1;
                }
                else{
                    contPessoaBom = contPessoaBom + 1;
                }
            }
        }

        porcentagemBom = (contPessoaBom * 100)/15;

        System.out.println("A média das idades das pessoas que responderam ótimo: "+mediaIdade);
        System.out.println("A quantidade de pessoas que responderam regular: "+contPessoaRegular);
        System.out.println("A porcentagem de pessoas que responderam bom: "+porcentagemBom+"%");

    }
}