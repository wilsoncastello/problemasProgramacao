package problemasProgramacao.cristopher.Problema0433;

import java.util.Scanner;

public class problema0433 {

    public static String ordemVetor(int[] x){
        int i = 0;
        int valor = x[i];
        boolean verificacao = false;
       
        for (int j = 1; j < x.length; j++) {
            valor++;
            if(valor == x[j]){
                verificacao = true;
            }else{
                verificacao = false;
                break;
            }
        }
        if(verificacao == true){
            String msg = "1";
            return msg;
        }
       
        valor = x[i];
        for (int j = 1; j < x.length; j++) {
            valor--;
            if(valor == x[j]){
                verificacao = true;
            }else{
                verificacao = false;
                break;
            }
        }
        if(verificacao == true){
            String msg = "2";
            return msg;
        }else{
            String msg = "0";
            return msg;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);                
       
         System.out.println("Digite o tamanho do vetor: ");
         int n = Integer.valueOf(input.nextLine());
         
         int v[] = new int[n];
         
         for (int i = 0; i < v.length; i++) {
             System.out.println("Digite o vetor na posição ["+i+"]: ");
             v[i] = Integer.valueOf(input.nextLine());
        }
        System.out.println(ordemVetor(v));

        input.close();
    }
    
}
