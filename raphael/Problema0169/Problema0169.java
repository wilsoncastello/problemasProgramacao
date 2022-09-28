package raphael.Problema0169;

import java.util.Scanner;

public class Problema0169 {
    
/* Faça um programa que receba a idade e o peso de quinze pessoas, e que calcule e mostre as médias dos pesos das pessoas da mesma faixa etária. As faixas etárias são: de 1 a 10 anos, de 11 a 20 anos, de 21 a 30 anos e de 31 anos para cima. */

    public static void main(String[] args) { 

        Scanner input = new Scanner(System.in);

        int idade, peso, contA=0, contB=0, contC=0, contD=0, mediaA=0, mediaB=0, mediaC=0, mediaD=0, Ra, Rb, Rc, Rd ;

        for (int i=0;i<15;i++) {

            System.out.println("Digite a idade da "+(i+1)+"ª pessoa: ");
            idade = Integer.valueOf(input.nextLine());

            System.out.println("Digite o peso da "+(i+1)+"ª pessoa: ");
            peso = Integer.valueOf(input.nextLine());

            if (idade > 0 && idade < 11) {
                mediaA = mediaA + peso;
                contA++;
            }
            else {
                if (idade > 10 && idade < 21) {
                    mediaB = mediaB + peso;
                    contB++;
                }
                else {
                    if (idade > 20 && idade < 31) {
                        mediaC = mediaC + peso;
                        contC++;
                    }
                    else {
                        mediaD = mediaD + peso;
                        contD++;
                    }
                }
            }

        }

        Ra = mediaA / contA;
        Rb = mediaB / contB;
        Rc = mediaC / contC;
        Rd = mediaD / contD;

        System.out.println("Peso médio das pessoas de 1 a 10 anos: "+Ra);
        System.out.println("Peso médio das pessoas de 11 a 20 anos: "+Rb);
        System.out.println("Peso médio das pessoas de 21 a 30 anos: "+Rc);
        System.out.println("Peso médio das pessoas com mais de 30 anos: "+Rd);

    }

}
