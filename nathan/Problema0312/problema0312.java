package Problema0312;

import java.util.Scanner;

public class problema0312 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int n =Integer.valueOf(input.nextLine());
        int menorN = Integer.MAX_VALUE, maiorN = Integer.MIN_VALUE, posMaior = 0, posMenor = 0, diferenca = 0, posIgual, novaDiferenca;
        int v[] = new int[n];

        for (int i = 0; i < v.length; i++) {
            System.out.println("Digite o vetor na posição " + i + ":");
            v[i] = Integer.valueOf(input.nextLine());
        }
        for (int i = 0; i < v.length; i++) {
            if(menorN > v[i]){
                menorN = v[i];
                posMenor = i;
            }
            if(maiorN < v[i]){
                maiorN = v[i];
                posMaior = i;
            }
        }
        if(posMaior > posMenor){
            diferenca = posMaior - posMenor;
        }else{
            diferenca = posMenor - posMaior;
        }
        for (int i = 0; i < v.length; i++) {
            if(menorN == v[i]){
                posIgual = i;
                novaDiferenca = posIgual - posMaior;
                if(novaDiferenca < 0)
                    novaDiferenca = novaDiferenca * -1;
                if((novaDiferenca) > diferenca){
                    diferenca = novaDiferenca;
                }
            }
            if(maiorN == v[i]){
                posIgual = i;
                novaDiferenca = posIgual - posMaior;
                if(novaDiferenca < 0)
                    novaDiferenca = novaDiferenca * -1;
                if((novaDiferenca) > diferenca){
                    diferenca = novaDiferenca;
                }
            }
        }


        System.out.println("Diferença: " + diferenca);
    }
}
