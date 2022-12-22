import java.util.Scanner;

public class problema0286 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int quantidadeElementosComuns = 0;
        for(int i=0;i<10;i++){
            System.out.print("Digite um número inteiro para a posição "+i+" do primeiro vetor: ");
            vetor1[i] = Integer.valueOf(input.nextLine());
        }
        for(int i=0;i<10;i++){
            System.out.print("Digite um número inteiro para a posição "+i+" do segundo vetor: ");
            vetor2[i] = Integer.valueOf(input.nextLine());
        }
        System.out.println("Elementos comuns aos conjuntos:");
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(vetor1[i] == vetor2[j]){
                    System.out.println(vetor1[i]);
                    quantidadeElementosComuns++;
                }
            }
        }
        if(quantidadeElementosComuns == 0){
            System.out.println("Não há nenhum elemento comum aos conjuntos!");
        }
    }
}