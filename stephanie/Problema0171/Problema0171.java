package stephanie.Problema0171;

import java.util.Scanner;

public class Problema0171 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int contSim = 0;
        int contNao = 0;
        int contSimFem = 0;
        int contNaoMas = 0;
        int contMas = 0;
        for(int i=0; i<10; i++){
            System.out.print("Digite o sexo do entrevistado(M/F):");
            String sexo = input.nextLine();
            System.out.print("Digite a resposta do entrevistado(S/N):");
            String resposta = input.nextLine();
            if(resposta.equals("N") || resposta.equals("n")){
                contNao++;
                if(sexo.equals("M") || sexo.equals("m")){
                    contNaoMas++;
                }
            }else if(resposta.equals("S")  || resposta.equals("s") ){
                contSim++;
                if(sexo.equals("F")  || sexo.equals("f") ){
                    contSimFem++;
                }
            }if(sexo.equals("M") || sexo.equals("m") ){
                contMas++;
            }
        }

        int porcentagem = (contNaoMas*contMas);
        System.out.println("O número de pessoas que responderam sim: "+contSim);
        System.out.println("O número de pessoas que responderam não: "+contNao);
        System.out.println("O número de mulherem que responderam sim: "+contSimFem);
        System.out.println("A porcentagem de homens que responderam não, entre todos os homens analisados: "+porcentagem+"%");
}
}
