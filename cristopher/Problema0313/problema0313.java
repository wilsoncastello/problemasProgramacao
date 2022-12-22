package problemasProgramacao.cristopher.Problema0313;

import java.util.Scanner;

public class problema0313 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int posPar = 0;

        //System.out.println("Digite quantos números deseja incluir no vetor: ");
        //int n = Integer.valueOf(input.nextLine());
        int vet[] = new int[10];

        for (int i = 0; i < vet.length; i++) {
            System.out.print("Digite o numero na posicao ["+i+"]: ");
            vet[i] = Integer.valueOf(input.nextLine());
        }

        for (int i = 0; i < vet.length; i++) {
            if(vet[i] % 2 == 0){
                posPar = i;
            }
        }

        System.out.println("Posicao do ultimo numero par -> " + posPar);

        input.close();

    }

}
